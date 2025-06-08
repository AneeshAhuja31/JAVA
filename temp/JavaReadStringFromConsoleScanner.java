import java.util.Scanner;

public class JavaReadStringFromConsoleScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a String:");
        String input = sc.nextLine();
        System.out.println("Input String in Upper Case = " + input.toUpperCase());

        System.out.println("Please enter an integer in Binary Format:");
        int i = sc.nextInt(2);
        System.out.println("Number in Decimal = " + i);

        sc.close();
    }
}

