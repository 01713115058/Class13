import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;
import java.nio.ByteBuffer;


public class BufferRead {
    public static void main(String[] args, Object StandardOpenOperation) {
        try{  
            Path path = Path.of("dyx.txt");

            FileChannel t = FileChannel.open(path,StandardOpenOption.CREATE,StandardOpenOption. WRITE,StandardOpenOption. READ);
            
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            
            String content = "love my country";

            t.read(buffer);

            buffer.flip();

            String result = new String(buffer.array(),0,buffer.limit());

            System.out.println("File content: " +result);

        }catch(IOException v){
            v.printStackTrace();
        }
    }

}
