/**
 * The Calculator class provides basic arithmetic operations.
 * This class demonstrates the use of JavaDoc comments.
 * 
 * @author Sukesh Kumar Bhagat
 * @version 1.0
 */
public class Calculator {
    /**
     * Adds two numbers and returns the result.
     *
     * @param a First number
     * @param b Second number
     * @return The sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }
    /**
     * Subtracts the second number from the first number.
     *
     * @param a First number
     * @param b Second number
     * @return The difference between a and b
     */
 public int subtract(int a, int b) {
        return a - b;
    }
    /**
     * Multiplies two numbers and returns the product.
     *
     * @param a First number
     * @param b Second number
     * @return The product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }



    /**
     * Divides the first number by the second number.
     *
     * @param a Dividend
     * @param b Divisor (must not be zero)
     * @return The quotient of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * Main method to test the Calculator class.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(10, 5));
        System.out.println("Difference: " + calc.subtract(10, 5));
        System.out.println("Product: " + calc.multiply(10, 5));
        System.out.println("Quotient: " + calc.divide(10, 5));
    }
}
