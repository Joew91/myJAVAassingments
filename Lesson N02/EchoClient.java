import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) throws IOException {
        String serverAddress = args[0];
        int port = Integer.parseInt(args[1]);

        Socket socket = new Socket(serverAddress, port);
        System.out.println("Connected to echo server " + serverAddress + " on port " + port);

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String inputLine;
        while ((inputLine = userInput.readLine()) != null) {
            out.println(inputLine);
            System.out.println(in.readLine());
        }

        in.close();
        out.close();
        socket.close();
    }
}
