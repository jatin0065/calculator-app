package bharat_intren;

import java.util.Scanner;

public class calculator_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stubimport java.util.Scanner;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Basic Calculator App!");
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        double result = 0.0; // Variable to store the result

        switch (choice) {
            case 1:
                System.out.println("Enter the first number: ");
                double addend1 = scanner.nextDouble();
                System.out.println("Enter the second number: ");
                double addend2 = scanner.nextDouble();
                result = add(addend1, addend2);
                break;
            case 2:
                System.out.println("Enter the first number: ");
                double minuend = scanner.nextDouble();
                System.out.println("Enter the second number: ");
                double subtrahend = scanner.nextDouble();
                result = subtract(minuend, subtrahend);
                break;
            case 3:
                System.out.println("Enter the first number: ");
                double factor1 = scanner.nextDouble();
                System.out.println("Enter the second number: ");
                double factor2 = scanner.nextDouble();
                result = multiply(factor1, factor2);
                break;
            case 4:
                System.out.println("Enter the dividend: ");
                double dividend = scanner.nextDouble();
                System.out.println("Enter the divisor: ");
                double divisor = scanner.nextDouble();
                result = divide(dividend, divisor);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }

        System.out.println("Result: " + result);
        scanner.close();
    }

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN; // Not-a-Number
        }
        return a / b;
    }
}


	}

}
