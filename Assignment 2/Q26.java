import java.util.Scanner;
class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}
public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking username and password as input
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();

        try {
            validateUser(username, password, confirmPassword);
            System.out.println("User is valid.");
        } catch (InvalidUserException e) {
            System.out.println("Validation error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validateUser(String username, String password, String confirmPassword) throws InvalidUserException {
        if (username.length() < 6) {
            throw new InvalidUserException("Username must be at least 6 characters long.");
        }
        if (!password.equals(confirmPassword)) {
            throw new InvalidUserException("Passwords do not match.");
        }
    }
}
