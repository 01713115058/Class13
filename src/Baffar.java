import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Baffar {
    public static void main(String[] args) {
        try (BufferedOutputStream obj = new BufferedOutputStream(
                new FileOutputStream("C:\\Users\\USER\\Documents\\Rafiya.txt"))) {
            
            obj.write("Addi soft ltd".getBytes());
            obj.flush(); // Not necessary here since we're closing the stream

            System.out.println("Data written successfully");

        } catch (IOException g) {
            g.printStackTrace();
        }
    }
}
