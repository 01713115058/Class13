import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\USER\\Documents\\Roza.txt";
        
      
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("I love my country");
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        try (FileReader reader = new FileReader(filePath)) {
            int number;
            while ((number = reader.read()) != -1) {
                System.out.print((char) number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
