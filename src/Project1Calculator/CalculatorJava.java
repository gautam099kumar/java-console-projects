package Project1Calculator;

import java.util.Scanner;

public class CalculatorJava {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== GAUTAM'S CALCULATOR 🚀 ===");

        while (running) {

            showMenu();

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            int result = calculate(num1, num2, choice);

            if (result == Integer.MIN_VALUE) {
                System.out.println("Invalid choice");
                continue;
            }

            System.out.println("Result: " + result);

            running = askToContinue(scanner);
        }
    }

    // shows calculator menu
    static void showMenu() {
        System.out.println("Choose operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
    }

    // performs calculation
    static int calculate(int num1, int num2, int choice) {

        if (choice == 1) {
            return num1 + num2;
        }
        else if (choice == 2) {
            return num1 - num2;
        }
        else if (choice == 3) {
            return num1 * num2;
        }
        else if (choice == 4) {
            return num1 / num2;
        }
        else {
            return Integer.MIN_VALUE;
        }
    }

    // asks user to continue or not
    static boolean askToContinue(Scanner scanner) {

        System.out.print("Do you want to continue? (yes/no): ");
        String answer = scanner.next();

        if (answer.equalsIgnoreCase("no")) {
            System.out.println("Calculator closed 👋");
            return false;
        }
        return true;
    }
}
