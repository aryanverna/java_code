import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the name of the first file: ");
      String file1 = scan.nextLine();
      System.out.print("Enter the name of the second file: ");
      String file2 = scan.nextLine();
      try (BufferedReader reader = new BufferedReader(new FileReader(file1));
           BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
         String line;
         while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
         }
         writer.write("end of file");
      } catch (IOException e) {
         System.out.println("An I/O error occurred.");
      }
   }
}
