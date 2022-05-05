import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
public class WebSocket {
  /*
    Web Socket class which opens up the websocket connection.
  */
  public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
  	ServerSocket server = new ServerSocket(8080);
    	try {
      		System.out.println("Server has started on 127.0.0.1:8080.\r\nWaiting for a connection...");
      		Socket client = server.accept();
      		System.out.println("A client connected.");
        }finally {
        	server.close();
	}
  }

}
