package AS5_Daytime;
// Write a Socket program to implement Day Time Server-client using TCP/UDP protocol.

// TCP Daytime Server
import java.io.*;
import java.net.*;
import java.util.Date;

public class DaytimeTCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(13); // Port 13 is commonly used for Daytime service

            System.out.println("Daytime TCP Server is running...");

            while (true) {
                Socket clientSocket = serverSocket.accept(); // Accept client connection
                System.out.println("Client connected: " + clientSocket);

                // Get the current date and time
                Date currentTime = new Date();

                // Create output stream for the client socket
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                // Send the current date and time to the client
                out.println(currentTime);

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
