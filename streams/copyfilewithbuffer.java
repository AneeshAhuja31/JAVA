import java.io.*;
public class copyfilewithbuffer {
    public static void main(String[] args) {
        FileInputStream is = null;
        FileOutputStream os = null;
        try{
            is = new FileInputStream("input.txt");
            os = new FileOutputStream("output.txt");

            byte [] buffer = new byte[1024];
            int length;
            while((length = is.read(buffer))>0){
                os.write(buffer,0,length);
            }
            is.close();
            os.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
