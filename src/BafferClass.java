import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;
import java.nio.ByteBuffer;



public class BafferClass {
    public static void main(String[] args ) {
        
        try{
            Path path = Path.of("abc.txt");
            FileChannel file = FileChannel.open(path,StandardOpenOption.CREATE,StandardOpenOption. WRITE);
            String content = "hello,bangladesh";
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put(content.getBytes());
            buffer.flip();
            file.write(buffer);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

}

