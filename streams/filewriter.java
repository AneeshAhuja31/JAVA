import java.io.*;
public class filewriter {
    public static void main(String[] args){
        try{
            String str = "File" + "Handling";
            FileWriter fw = new FileWriter("output.txt");
            for(int i=0;i<str.length();i++){
                fw.write(str.charAt(i));
            }
            fw.close();
            System.out.println("DONE!");
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
