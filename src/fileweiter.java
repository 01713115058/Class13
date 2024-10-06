import java.io.FileInputStream;

public class fileweiter {
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWiter("C:\\Users\\USER\\rrrr.text");
            obj.Write("Hello world\n");
            obj.Write("Bangladesh is small country\n");
            obj.Write("bangladesh is wonder full country\n");

            obj.close();
            System.out.println("succesfully worte to the file");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
