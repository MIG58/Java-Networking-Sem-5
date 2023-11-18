package AS5_Daytime;
// TCP Daytime Client 
import java.io.*;
import java.net.*;

public class DaytimeTCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 13); // Connect to the Daytime server on localhost and port 13

            // Create input stream for the server socket
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Receive and print the current date and time from the server
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
