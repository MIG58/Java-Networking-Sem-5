package AS3_Echo;
// Write and run a TCP client and a TCP server program using C / ‘JAVA’ language in UNIX  /
// LINUX  / Windows  as per the following details:   
  
// I. Establish a TCP connection between a TCP client and a TCP server.  
// II. Client program will send some messages (echo client) to the server. 
// III. Server will return the messages/acknowledgement (echo server) to the client.

// TCP Server (Echo Server):

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345); // Create a server socket

            System.out.println("Server is listening on port 12345...");

            while (true) {
                Socket clientSocket = serverSocket.accept(); // Accept client connection
                System.out.println("Client connected: " + clientSocket);

                // Create input and output streams for the client socket
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("Received from client: " + message);
                    out.println("Server: " + message); // Echo the message back to the client
                }

                // Close the streams and the client socket
                in.close();
                out.close();
                clientSocket.close();
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
