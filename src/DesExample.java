import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class DesExample {
    private static final String Empoloyee = null;

    public static void main(String[] args) {
         try{

           
            FileInputStream file = new FileInputStream("employee.ser");
           ObjectInputStream g = new ObjectInputStream(file);
            Empoloyee  emp = (Empoloyee)g.readObject();
            emp.display();
         }
         catch(IOException g){
            g.printStackTrace();

         }
         catch(ClassNotFoundException t){
            t.printStackTrace();
         }
    }

}
