import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DesializationExample {
public static void main(String[] args) {

    try{

        FileInputStream rr = new FileInputStream("employee.txt");
        ObjectInputStream dd = new ObjectInputStream(rr);
        PracticeProduct j = (PracticeProduct)dd.readObject();
        j.display();
        dd.close();
        rr.close();


    }catch(IOException e){
        e.printStackTrace();

    } catch(ClassNotFoundException a){
        a.printStackTrace();
    }


}


}
