import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class FileoutputstreamExample {
    public static void main(String[] args) {
        try{
            FileOutputStream vv = new FileOutputStream("C:\\Users\\USER\\Documents\\abcd.txt");
            try{
                vv.write("hallow \n".getBytes());
                vv.write("bangladesh is a samll country".getBytes());

            }
            finally{

                vv.close();
                System.out.println("file Insert succesfully ");
            }
          

        }catch(IOException r){
            r.printStackTrace();
        }

        try{
            FileInputStream e = new FileInputStream("C:\\\\Users\\\\USER\\\\Documents\\\\abcd.txt");
            int number;

            while ((number = e.read()) != -1) {
                System.out.print((char) number);
            }
                
            
            
        }catch(IOException s){
            s.printStackTrace();

        }



       
        
    }

}
