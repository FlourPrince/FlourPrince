package ServerAndClient;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class JabberServer {
	//¶¨Òå¶Ë¿Ú
	public static  final int port=8080;
	 
	public static void main(String[] args) throws IOException {
		ServerSocket serversocket = new ServerSocket(port);
		System.out.println("serversocket:" + serversocket);
		try {
			Socket socket = serversocket.accept();
			try {
				System.out.println("socket:" + socket);
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
				while (true) {
					String str = br.readLine();
					if (str.equals("END")) {
						break;
					}
					pw.println(str);
				}
			}
			finally {
				System.out.println("socket.close¡£¡£¡£¡£");
				socket.close();
			}
		}
		finally {
			System.out.println("serversocket.close¡£¡£¡£¡£");
			serversocket.close();
		}

	}

}
