import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class ChatServer {
    private static final List<ClientHandler> clients = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter port number to listen on: ");
        int port = scanner.nextInt();

        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server started on port " + port);

        try {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clients.add(clientHandler);
                new Thread(clientHandler).start();
            }
        } finally {
            serverSocket.close();
        }
    }

    public static void broadcast(String message, ClientHandler sender) {
        for (ClientHandler client : clients) {
            if (client != sender) {
                client.sendMessage(message);
            }
        }
    }

    public static void removeClient(ClientHandler client) {
        clients.remove(client);
    }
}

class ClientHandler implements Runnable {
    private final Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private String userName;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Enter your name: ");
            userName = in.readLine();
            System.out.println(userName + " has joined the chat.");
            ChatServer.broadcast(userName + " has joined the chat.", this);

            String message;
            while ((message = in.readLine()) != null) {
                System.out.println(userName + ": " + message);
                ChatServer.broadcast(userName + ": " + message, this);
            }
        } catch (IOException e) {
            System.err.println("Connection error with client.");
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ChatServer.removeClient(this);
            ChatServer.broadcast(userName + " has left the chat.", this);
            System.out.println(userName + " disconnected.");
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }
}
