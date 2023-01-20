import java.util.Scanner;

public class MyDate {
   private int day;
   private int month;
   private int year;

   public MyDate(int day, int month, int year) throws InvalidDateException {
      if (!isValidDate(day, month, year)) {
         throw new InvalidDateException("Invalid date: " + day + "/" + month + "/" + year);
      }
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public void acceptDate() {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter day: ");
      int day = scan.nextInt();
      System.out.print("Enter month: ");
      int month = scan.nextInt();
      System.out.print("Enter year: ");
      int year = scan.nextInt();
      try {
         setDate(day, month, year);
      } catch (InvalidDateException e) {
         System.out.println(e.getMessage());
      }
   }

   public void displayDate() {
      System.out.println(day + "/" + month + "/" + year);
   }

   public void setDate(int day, int month, int year) throws InvalidDateException {
      if (!isValidDate(day, month, year)) {
         throw new InvalidDateException("Invalid date: " + day + "/" + month + "/" + year);
      }
      this.day = day;
      this.month = month;
      this.year = year;
   }

   private boolean isValidDate(int day, int month, int year) {
      if (month < 1 || month > 12) {
         return false;
      }
      int maxDays = 31;
      if (month == 4 || month == 6 || month == 9 || month == 11) {
         maxDays = 30;
      } else if (month == 2) {
         maxDays = 28;
         if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            maxDays = 29;
         }
      }
      if (day < 1 || day > maxDays) {
         return false;
      }
      return true;
   }
   public class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
       super(message);
    }
 }
 
 public class Main {
    public static void main(String[] args) throws MyDate.InvalidDateException {
       MyDate date = new MyDate(29, 2, 2022);
       date.displayDate();
       date.acceptDate();
       date.displayDate();
    }
 }
 
}

