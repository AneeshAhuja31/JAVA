// Java Program to illustrate the use of continue statement
// with a label inside an inner loop to continue the outer loop

public class ContinueLabel {
    public static void main(String[] args) {
        aa: 
        for (int i = 1; i <= 3; i++) {
            bb: 
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    // Using continue statement with label
                    continue aa;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}

