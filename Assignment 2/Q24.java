import java.util.Scanner;
class TooOlderException extends Exception {
    public TooOlderException(String message) {
        super(message);
    }
}

class TooYoungerException extends Exception {
    public TooYoungerException(String message) {
        super(message);
    }
}
public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking candidate's name and age as input
        System.out.print("Enter candidate's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter candidate's age: ");
        int age = scanner.nextInt();

        try {
            checkEligibility(name, age);
        } catch (TooOlderException | TooYoungerException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void checkEligibility(String name, int age) throws TooOlderException, TooYoungerException {
        if (age > 45) {
            throw new TooOlderException("TooOlder: The candidate " + name + " is too old for this position.");
        } else if (age < 20) {
            throw new TooYoungerException("TooYounger: The candidate " + name + " is too young for this position.");
        } else {
            System.out.println("Eligible: The candidate " + name + " is eligible for this position.");
        }
    }
}
