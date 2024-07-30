import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            try {
                // Prompt the user to enter two numbers
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                // Prompt the user to choose an operation
                System.out.println("Choose an operation: + (Addition), - (Subtraction), * (Multiplication), / (Division)");
                char operation = scanner.next().charAt(0);

                // Perform the selected operation and display the result
                double result = 0;
                boolean validOperation = true;

                switch (operation) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                            validOperation = false;
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operation.");
                        validOperation = false;
                        break;
                }

                if (validOperation) {
                    System.out.println("The result is: " + result);
                }

            } catch (Exception e) {
                System.out.println("Error: Invalid input only digits are allowed .");
            } finally {
                scanner.close();
            }
        }
    }

