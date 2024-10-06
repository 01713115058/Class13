import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputExample {
    public static void main(String[] args) {
        // Writing data to a file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\USER\\ss.txt"))) {
            dos.writeInt(10);
            dos.writeDouble(10.5); // Corrected to write a double
            dos.writeChar('A');
            dos.writeFloat(12.3f); // Corrected method name to writeFloat

            System.out.println("Data written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading data from a file
        try (DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\USER\\ss.txt"))) {
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            char charValue = dis.readChar();
            float floatValue = dis.readFloat();

            System.out.println("Read values:");
            System.out.println("Int: " + intValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("Char: " + charValue);
            System.out.println("Float: " + floatValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
