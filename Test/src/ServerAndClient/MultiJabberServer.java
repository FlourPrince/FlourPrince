package ServerAndClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiJabberServer {
	public static final int port = 8080;

	public static void main(String[] args) throws IOException {

		ServerSocket s = new ServerSocket(port);
		System.out.println("Server Started");
		try {
			while (true) {
				Socket socket = s.accept();
				try {
					new ServeOneJabber(socket);
				}
				catch (IOException e) {
					socket.close();
				}
			}
		}
		finally {
			s.close();
		}

	}
}
