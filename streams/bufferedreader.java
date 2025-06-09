import java.io.*;
public class bufferedreader {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string");
            String input = br.readLine();
            br.close();
            System.out.println("In lower case: "+input.toLowerCase());
        }
        catch(IOException e){
            System.out.println("An error occured: "+e.getMessage());
        }
    }
}
