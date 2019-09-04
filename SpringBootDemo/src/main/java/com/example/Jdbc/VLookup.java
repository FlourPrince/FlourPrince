package com.example.Jdbc;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VLookup extends Applet {
	String dbUrl = "jdbc:mysql://123.206.55.50:3306/Location_punch_card";
	String user = "root";
	String password = "1601n";
	Statement s;
	TextField searchFor = new TextField(20);
	Label completion = new Label(" ");
	TextArea results = new TextArea(40, 20);

	public void init() {
		searchFor.addTextListener(new SearchForL());
		Panel p = new Panel();
		p.add(new Label("Last name to search for:"));
		p.add(searchFor);
		p.add(completion);
		setLayout(new BorderLayout());
		add(p, BorderLayout.NORTH);
		add(results, BorderLayout.CENTER);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(dbUrl, user, password);
			s = c.createStatement();
		}
		catch (Exception e) {
			results.setText(e.getMessage());
		}
	}

	class SearchForL implements TextListener {
		public void textValueChanged(TextEvent te) {
			ResultSet r;
			if (searchFor.getText().length() == 0) {
				completion.setText("");
				results.setText("");
				return;
			}
			try {
				r = s.executeQuery("select * from boss_staff " + "WHERE (BOSS Like '" + searchFor.getText() + "%') ORDER BY BOSS");
				if (r.next())
					completion.setText(r.getString("BOSS"));
			}
			catch (Exception e) {
				results.setText(searchFor.getText() + "\n");
				results.append(e.getMessage());
				return;
			}
			results.setText("");
			try {
				while (r.next()) {
					results.append(r.getString("BOSS"));
				}
			}
			catch (Exception e) {
				results.setText(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		VLookup applet = new VLookup();
		Frame aFrame = new Frame("Email lookup");
		aFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		aFrame.add(applet, BorderLayout.CENTER);
		aFrame.setSize(500, 200);
		applet.init();
		applet.start();
		aFrame.setVisible(true);
	}
}
