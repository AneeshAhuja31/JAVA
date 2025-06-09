import java.io.*;
public class copyingfileusingbytestream {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream("candy.jpg");
            out = new FileOutputStream("output.jpg");
            int c = in.read();
            while(c!=-1){
                out.write(c);
                c=in.read();
            }
        }
        finally{
            if (in!=null){
                in.close();
            }
            if(out!=null){
                out.close();
            }
        }
    }
}
