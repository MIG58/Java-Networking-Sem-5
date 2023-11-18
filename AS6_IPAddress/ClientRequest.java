package AS6_IPAddress;

// public TCP Client 
import java.io.*;
import java.net.*;

public class ClientRequest {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345); // Connect to the server on localhost and port 12345

            // Create input stream for the server socket
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Send a request to the server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Requesting Server IP Address");

            // Receive and print the server's response (its IP address)
            String response = in.readLine();
            System.out.println("Server Response: " + response);

            // Close the input stream and the client socket
            in.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
