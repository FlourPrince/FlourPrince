package ServerAndClient;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class JabberClient {
	
	public static void main(String[] args) throws IOException {
		InetAddress address = InetAddress.getByName(null);

		Socket socket = new Socket(address, JabberServer.port);
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			PrintWriter bw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
			for (int i = 0; i < 10; i++) {
				bw.println(i);
				String str = br.readLine();
				System.out.println(str);
			}
			bw.println("END");
		}
		finally {
			System.out.println("close.....");
			socket.close();
		}

	}
}
