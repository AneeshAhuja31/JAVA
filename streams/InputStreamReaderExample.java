import java.io.*;

public class InputStreamReaderExample {
    public static void main(String[] args) {
        InputStreamReader cin = null;
        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit:");
            char c;
            do {
                c = (char) cin.read(); // reads single character
                System.out.print(c);   // echoes it back
            } while (c != 'q');
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (cin != null) cin.close();
            } catch (IOException e) {
                System.out.println("Error closing stream: " + e.getMessage());
            }
        }
    }
}
