import java.util.Scanner;

public class MenuNotMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      // Display the menu
      System.out.println("\nMenu:");
      System.out.println("1. Calculate the volume of a cylinder");
      System.out.println("2. Find the factorial of a number");
      System.out.println("3. Check if a number is an Armstrong number");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");

      // Read the user's choice
      int choice = scanner.nextInt();

      // Perform the selected operation
      switch (choice) {
        case 1:
          // Calculate the volume of a cylinder
          System.out.print("Enter the radius of the cylinder: ");
          double radius = scanner.nextDouble();
          System.out.print("Enter the height of the cylinder: ");
          double height = scanner.nextDouble();
          double volume = Math.PI * radius * radius * height;
          System.out.println("Volume: " + volume);
          break;
        case 2:
          // Find the factorial of a number
          System.out.print("Enter a number: ");
          int number = scanner.nextInt();
          int factorial = 1;
          for (int i = 1; i <= number; i++) {
            factorial *= i;
          }
          System.out.println("Factorial: " + factorial);
          break;
        case 3:
          // Check if a number is an Armstrong number
          System.out.print("Enter a number: ");
          int num = scanner.nextInt();
          int digits = 0;
          int temp = num;
          while (temp > 0) {
            digits++;
            temp /= 10;
          }
          int sum = 0;
          temp = num;
          while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
          }
          if (sum == num) {
            System.out.println(num + " is an Armstrong number");
          } else {
            System.out.println(num + " is not an Armstrong number");
          }
          break;
        case 4:
          // Exit the program
          System.out.println("Exiting the program...");
          return;
        default:
          // Invalid choice
          System.out.println("Invalid choice. Please try again.");
          break;
      }
    }
    
  }
}
