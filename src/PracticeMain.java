import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PracticeMain {

    public static void main(String[] args) {
        PracticeProduct  g = new PracticeProduct();

        g.setName("rabeya");
        g.setCategory("student");
        g.setBrand("addie");
        g.setQpt(3);
        g.setPrice(7);
        g.display();
  
        try  {
            FileOutputStream file = new FileOutputStream("employee.txt");
             ObjectOutputStream obj = new ObjectOutputStream(file);

             obj.writeObject(g);
             obj.close();
             file.close();
             System.out.println("succesfully serialization");

     
        } catch(IOException h){
            h.printStackTrace();

        }
    }
}
