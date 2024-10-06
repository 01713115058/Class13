
import java.io.FileWriter;
import java.io.IOException;


public class FileWriter1 {
    public static void main(String[] args) {
        
       try{
        FileWriter obj = new FileWriter("C:\\Users\\USER\\Documents\\abc.txt");
          obj.write("hello world");


          obj.close();
          System.out.println("file write succesfully");
          

       }
       catch(IOException e){
        e.printStackTrace();
       }
    }

}
