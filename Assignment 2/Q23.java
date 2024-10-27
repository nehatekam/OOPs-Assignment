class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}

class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}

public class Q23 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a temperature value as a command line argument.");
            return;
        }

        try {
            double temperature = Double.parseDouble(args[0]);
            checkTemperature(temperature);
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature value. Please enter a numeric value.");
        } catch (TooHotException | TooColdException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkTemperature(double temperature) throws TooHotException, TooColdException {
        if (temperature > 35) {
            throw new TooHotException("TooHot: Temperature is too hot!");
        } else if (temperature < 5) {
            throw new TooColdException("TooCold: Temperature is too cold!");
        } else {
            System.out.println("Normal: Temperature is within the normal range.");
            double fahrenheit = (temperature * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        }
    }
}
