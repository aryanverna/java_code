import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (// Prompt the user to enter the size of the array
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();

            // Create an array of the specified size
            int[] numbers = new int[n];

            // Define an array of integers
            // int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            // Prompt the user to enter the elements of the array
            System.out.println("Enter the elements of the array : ");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            // Find the largest number
            int max = numbers[0];
            for (int i = 1; i < n; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            // Print the largest number
            System.out.println("Largest number: " + max);
        }
    }
}