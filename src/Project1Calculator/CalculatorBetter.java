package Project1Calculator;

import java.util.Scanner;

public class CalculatorBetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while (flag) {

            System.out.println("Fun Calculator");
            System.out.println("Enter your choice");
            System.out.println("1. ADD");
            System.out.println("2. SUBS");
            System.out.println("3. MUL");
            System.out.println("4. DIV");

            int choice = sc.nextInt();
            System.out.println("Enter number1");
            int num1 = sc.nextInt();
            System.out.println("Enter number 2");
            int num2 = sc.nextInt();

            if (choice == 1) {
                System.out.println("Sum of two numbers " + (num1 + num2));
            } else if (choice == 2) {
                System.out.println("Minus of two numbers " + (num1 - num2));
            } else if (choice == 3) {
                System.out.println("Multiply of two numbers " + (num1 * num2));
            } else if (choice == 4) {
                System.out.println("Divison of two numbers " + (num1 / num2));
            } else {
                System.out.println("Invalid choice");
                continue;
            }

            System.out.println("You want to contiue press yes or no");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("no")) {
                flag = false;
                System.out.println("Bye building keep building");
            }
        }

    }
}
