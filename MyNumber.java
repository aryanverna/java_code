public class MyNumber {
  // Private integer data member
  private int value;

  // Default constructor
  public MyNumber() {
    this.value = 0;
  }

  // Constructor that initializes the value
  public MyNumber(int value) {
    this.value = value;
  }

  // Check if the number is negative
  public boolean isNegative() {
    return value < 0;
  }

  // Check if the number is positive
  public boolean isPositive() {
    return value > 0;
  }

  // Check if the number is zero
  public boolean isZero() {
    return value == 0;
  }

  // Check if the number is odd
  public boolean isOdd() {
    return value % 2 != 0;
  }

  // Check if the number is even
  public boolean isEven() {
    return value % 2 == 0;
  }

  public static void main(String[] args) {
    MyNumber number = new MyNumber(10);
    // Check if the number is negative
    System.out.println("Is negative: " + number.isNegative());

    // Check if the number is positive
    System.out.println("Is positive: " + number.isPositive());

    // Check if the number is zero
    System.out.println("Is zero: " + number.isZero());

    // Check if the number is odd
    System.out.println("Is odd: " + number.isOdd());

    // Check if the number is even
    System.out.println("Is even: " + number.isEven());
  }
}