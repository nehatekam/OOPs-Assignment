import java.util.HashMap;
import java.util.Map;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}


public class Q21 {

    // Static map to store countries and their capitals
    private static Map<String, String> countriesAndCapitals = new HashMap<>();

    static {
        countriesAndCapitals.put("India", "New Delhi");
        countriesAndCapitals.put("USA", "Washington D.C.");
        countriesAndCapitals.put("Japan", "Tokyo");
        countriesAndCapitals.put("Germany", "Berlin");
        // Add more countries and capitals as needed
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a country name as a command line argument.");
            return;
        }

        String country = args[0];
        try {
            String capital = getCapital(country);
            System.out.println("The capital of " + country + " is " + capital + ".");
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to get the capital of a country
    public static String getCapital(String country) throws NoMatchFoundException {
        if (countriesAndCapitals.containsKey(country)) {
            return countriesAndCapitals.get(country);
        } else {
            throw new NoMatchFoundException("No match found for the country: " + country);
        }
    }
}
