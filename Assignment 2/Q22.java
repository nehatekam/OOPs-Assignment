class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class Q22 {

    public static void main(String[] args) {
        try {
            double result = calculateEquation(10, 0);
            System.out.println("Result: " + result);
        } catch (CustomArithmeticException e) {
            System.out.println("Custom Arithmetic Exception caught: " + e.getMessage());
        }
    }
    
    public static double calculateEquation(double a, double b) throws CustomArithmeticException {
        try {
            double divisionResult = divide(a, b);
            double sqrtResult = sqrt(divisionResult);
            return sqrtResult;
        } catch (ArithmeticException e) {
            throw new CustomArithmeticException("Arithmetic error occurred: " + e.getMessage());
        }
    }
    
    private static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
    
    private static double sqrt(double value) {
        if (value < 0) {
            throw new ArithmeticException("Negative value for square root");
        }
        return Math.sqrt(value);
    }
}
    

