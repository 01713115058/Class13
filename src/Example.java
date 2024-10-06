import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        try (BufferedInputStream obj = new BufferedInputStream(
                new FileInputStream("C:\\Users\\USER\\Documents\\Rafiya.txt"))) {
            
            byte[] buffer = new byte[1024]; // Buffer for reading
            int bytesRead;
            
            // Read bytes from the file until the end
            while ((bytesRead = obj.read(buffer)) != -1) {
                // Convert bytes to String and print
                System.out.print(new String(buffer, 0, bytesRead));
            }

        } catch (IOException g) {
            g.printStackTrace();
        }
    }
}
