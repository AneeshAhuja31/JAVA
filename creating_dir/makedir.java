import java.io.*;
public class makedir {
    public static void main(String[] args) {
        String dirname = "/newdir/newdir";
        File d = new File(dirname);

        d.mkdirs();
    }
}
