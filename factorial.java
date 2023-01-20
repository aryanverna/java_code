import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        // Prompt the user to enter a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Compute the factorial of the number
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
          factorial *= i;
        }
        
        // Print the factorial
        System.out.println("Factorial: " + factorial);
      }
}
