import java.io.IOException;
import java.io.File;

public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\USER\\Documents\\Rafiya.txt");

        if (file.createNewFile()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File already exists");
        }
    }
}
