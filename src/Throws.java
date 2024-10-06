import java.io.IOException;
import java.io.File;

public class Throws {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\USER\\Documents\\Rafiya.txt");

        if (file.createNewFile()) {
        System.out.println("file successfully create");
        
        } else {
            System.out.println("File Not Exist");
        }
    }
}
