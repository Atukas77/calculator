import java.util.*;

public class calculator {
    public static void main(String[] args) {
        double first = 0;
        double second = 0;
        char op = ' ';
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter first operand:");
            try {
                first = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input for the first operand.");
                scanner.next(); // Clear invalid input
            }
        }
        
        while (true) {
            System.out.println("Enter second operand:");
            try {
                second = scanner.nextDouble();
                break; 
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input for the second operand.");
                scanner.next(); // Clear invalid input
            }
        }
        
        System.out.println("Enter operator (+, -, *, /):");
        op = scanner.next().charAt(0);
        
        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
        
        System.out.println("Result: " + result);

        scanner.close();
    }
}