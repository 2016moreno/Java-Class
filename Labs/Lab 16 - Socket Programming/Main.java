package lab16;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Main {

	public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(9090);
        try {
            while (true) {
                Socket socket = listener.accept();
                try {
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    out.println("Welcome to Mr. Moreno's server");
                } finally {socket.close();
}
            }
        }
        finally {
            listener.close();
        }
    }
}

//129.113.224.221