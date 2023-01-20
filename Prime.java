public class Prime {
    public static void main(String[] args) {
      for (int i = 2; i <= 50; i++) {
        if (isPrime(i)) {
          System.out.print(i + " ");
        }
      }
    }
  
    public static boolean isPrime(int n) {
      if (n <= 1) {
        return false;
      }
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
    }
  }
  

//   import java.util.Scanner;

// public class Reverse {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);

//     // Prompt the user to enter a number
//     System.out.print("Enter a number: ");
//     int number = input.nextInt();

//     // Reverse the number
//     int reverse = 0;
//     while (number != 0) {
//       reverse = reverse * 10 + number % 10;
//       number = number / 10;
//     }

//     // Display the result
//     System.out.println("The reverse of the number is: " + reverse);
//   }
// }


// import java.util.Scanner;

// public class PalindromeNumber {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);

//     // Prompt the user to enter a number
//     System.out.print("Enter a number: ");
//     int number = input.nextInt();

//     // Check if the number is a palindrome
//     if (isPalindrome(number)) {
//       System.out.println(number + " is a palindrome.");
//     } else {
//       System.out.println(number + " is not a palindrome.");
//     }
//   }

//   public static boolean isPalindrome(int number) {
//     int reverse = 0;
//     int original = number;
//     while (number != 0) {
//       reverse = reverse * 10 + number % 10;
//       number = number / 10;
//     }
//     return original == reverse;
//   }
// }
