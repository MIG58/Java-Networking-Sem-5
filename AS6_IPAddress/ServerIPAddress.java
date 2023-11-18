package AS6_IPAddress;
// 6. Write a Socket program : Client Request and server send its IP Address using TCP protocol

// TCP Server
import java.io.*;
import java.net.*;

public class ServerIPAddress {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345); // Create a server socket

            System.out.println("Server is listening on port 12345...");

            while (true) {
                Socket clientSocket = serverSocket.accept(); // Accept client connection
                System.out.println("Client connected: " + clientSocket);

                // Get the server's IP address
                String serverIPAddress = clientSocket.getLocalSocketAddress().toString();
                
                // Create output stream for the client socket
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                // Send the server's IP address to the client
                out.println("Server IP Address: " + serverIPAddress);

                // Close the output stream and the client socket
                out.close();
                clientSocket.close();
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
