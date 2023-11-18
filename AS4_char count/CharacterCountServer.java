// Write and run a TCP client and a TCP server program using C / JAVA language in Unix/Linux  according to the following specifications:     

// 1. Establish a TCP connection between a TCP client and a TCP server.  
// 2. Client program will send a string of characters to the specific server.  
// 3. Server program will count the number of characters (Length) in the given string and return back to the respective client.

// TCP Server (CharacterCountServer.java)
import java.io.*;
import java.net.*;

public class CharacterCountServer {
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

                // Receive the string from the client
                String clientMessage = in.readLine();
                System.out.println("Received from client: " + clientMessage);

                // Count the characters in the received string
                int charCount = clientMessage.length();

                // Send the character count back to the client
                out.println("Character count: " + charCount);

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

