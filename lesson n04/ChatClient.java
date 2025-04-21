import java.io.*;
import java.net.*;
import java.util.*;

public class ChatClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter server IP address: ");
        String serverAddress = scanner.nextLine();
        System.out.print("Enter server port: ");
        int port = scanner.nextInt();
        scanner.nextLine();

        try (Socket socket = new Socket(serverAddress, port);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            new Thread(() -> {
                String message;
                try {
                    while ((message = in.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    System.out.println("Disconnected from server.");
                }
            }).start();

            while (true) {
                String userInput = scanner.nextLine();
                out.println(userInput);
            }

        } catch (IOException e) {
            System.out.println("Unable to connect to server: " + e.getMessage());
        }
    }
}
