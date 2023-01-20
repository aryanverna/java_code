import java.util.Scanner;

class InvalidUsernameException extends Exception {
  public InvalidUsernameException(String message) {
    super(message);
  }
}

class InvalidPasswordException extends Exception {
  public InvalidPasswordException(String message) {
    super(message);
  }
}

class EmailId {
  private String username;
  private String password;

  public EmailId() {
    // Default constructor
  }

  public EmailId(String username, String password) throws InvalidUsernameException, InvalidPasswordException {
    setUsername(username);
    setPassword(password);
  }

  public void setUsername(String username) throws InvalidUsernameException {
    if (username.length() < 8) {
      throw new InvalidUsernameException("Username must be at least 8 characters long.");
    }
    this.username = username;
  }

  public void setPassword(String password) throws InvalidPasswordException {
    if (password.length() < 8) {
      throw new InvalidPasswordException("Password must be at least 8 characters long.");
    }
    this.password = password;
  }
}

public class Main1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();
    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    try {
      EmailId emailId = new EmailId(username, password);
      System.out.println("Email ID created successfully!");
    } catch (InvalidUsernameException e) {
      System.out.println(e.getMessage());
    } catch (InvalidPasswordException e) {
      System.out.println(e.getMessage());
    }
  }
}
 