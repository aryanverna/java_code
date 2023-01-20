import java.util.Scanner;

class User {
  // Fields to store the username and password
  private String username;
  private String password;

  // Constructor to initialize the username and password
  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  // Getter methods to access the username and password
  public String getUsername() {
    return username;
  }
  public String getPassword() {
    return password;
  }
}

class Validator {
  // Method to compare the input credentials to the stored username and password
  public void validate(String inputUsername, String inputPassword, User user) throws Exception {
    if (!inputUsername.equals(user.getUsername()) || !inputPassword.equals(user.getPassword())) {
      throw new Exception("Invalid credentials");
    }
  }

  public static void main(String[] args) {
    // Create a user object with a username and password
    User user = new User("john.doe", "password123");

    // Create a validator object
    Validator validator = new Validator();

    // Read input credentials from the user
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter username: ");
    String inputUsername = scanner.nextLine();
    System.out.print("Enter password: ");
    String inputPassword = scanner.nextLine();

    try {
      // Validate the input credentials
      validator.validate(inputUsername, inputPassword, user);
      System.out.println("Valid credentials");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }


}


  