/**
 * Object-Oriented Paradigm:
 * This implementation demonstrates key OOP principles:
 */
import java.util.Scanner;

// Calculator class encapsulating  operations
public class caa7232_Calculator {
    private double result; // Stores the result of the last operation

    // Constructor initializes the result to 0
    public caa7232_Calculator() {
        result = 0;
    }

    // Addition method
    public double add(double a, double b) {
        result = a + b;
        return result;
    }

    // Subtraction method
    public double subtract(double a, double b) {
        result = a - b;
        return result;
    }

    // Multiplication method
    public double multiply(double a, double b) {
        result = a * b;
        return result;
    }

    // Division method
    // Throws ArithmeticException if attempting to divide by zero
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        result = a / b;
        return result;
    }

    // Getter for the result
    public double getResult() {
        return result;
    }

    // Main method to run the calculator
    public static void main(String[] args) {
        caa7232_Calculator calc = new caa7232_Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Get user input for numbers and operation
                System.out.print("Enter the first number: ");
                double num1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter the second number: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter operation (+, -, *, /) or 'q' to quit: ");
                String operation = scanner.nextLine();

                // Perform the requested operation
                switch (operation) {
                    case "+":
                        calc.add(num1, num2);
                        break;
                    case "-":
                        calc.subtract(num1, num2);
                        break;
                    case "*":
                        calc.multiply(num1, num2);
                        break;
                    case "/":
                        calc.divide(num1, num2);
                        break;
                    case "q":
                        System.out.println("Exiting the calculator. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid operation. Please try again.");
                        continue;
                }

                // Display the result
                System.out.printf("Result: %.2f%n", calc.getResult());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
