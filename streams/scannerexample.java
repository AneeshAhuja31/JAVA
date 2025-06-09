import java.util.Scanner;
public class scannerexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = sc.nextLine();
        System.out.println("Input String in Upper Case = "+input.toUpperCase());
        System.out.println("Please enter a integer in binary format: ");
        int i = sc.nextInt(2);
        System.out.println("Number in decimal = "+i);
        sc.close();
    }
    
}
