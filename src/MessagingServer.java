import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.*;
import java.io.IOException;

public class MessagingServer {
    public static void main(String[] args) {
        try{
            //create 
          ServerSocket Server12 = new  ServerSocket (5000);
            System.out.println("Server is listening on port5000...");
//client connected
            Socket socket = Server12.accept();
            System.out.println("Client connected");
//Received message from clint
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            //send message client
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output,true);
//read message from the clint
            String message = reader.readLine();
            System.out.println("Received from clint: " +message);
            //send response back to the clint
            writer.println("hello from sever");

            //close connection
            socket.close();
            Server12.close();





        }catch(IOException s){
            s.printStackTrace();

        }
    }

    private Socket accept() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accept'");
    }

}
