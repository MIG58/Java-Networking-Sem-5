// TCP Client (CharacterCountClient.java)

import java.io.*;
import java.net.*;

public class CharacterCountClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345); // Connect to the server on localhost and port 12345

            // Create input and output streams for the server socket
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Read a string from the user
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a string to send to the server: ");
            String message = userInput.readLine();

            // Send the string to the server
            out.println(message);

            // Receive and print the server's response (character count)
            String response = in.readLine();
            System.out.println("Server Response: " + response);

            // Close the streams and the client socket
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
