package com.example.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {
	public String  test() {
        String Url="jdbc:mysql://123.206.55.50:3306/Location_punch_card";
        String  User="root";
        String Password="1601n";
        String sql="select * from boss_staff";
        ResultSet result=null;
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(Url,User,Password);
			Statement state=c.createStatement();
			 result=state.executeQuery(sql);
			while(result.next()) {
				System.out.println("Boss:"+result.getString("boss")+",staff:"+result.getString("staff")+",contractNumber:"+result.getString("contract_number"));
			}
			c.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();


	}
}
