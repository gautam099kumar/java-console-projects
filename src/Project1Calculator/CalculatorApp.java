package Project1Calculator;

import java.util.Scanner;

public class CalculatorApp {

    static void showMenu(){
        System.out.println("Fun Calculator");
        System.out.println("Enter your choice");
        System.out.println("1. ADD");
        System.out.println("2. SUBS");
        System.out.println("3. MUL");
        System.out.println("4. DIV");
    }
    static int result(int choice,int num1,int num2){
        if (choice==1){
            return num1+num2;
        } else if (choice==2) {
            return num1-num2;
        }
        else if (choice==3){
            return num1*num2;
        } else if (choice==4) {
            return num1/num2;
        }
        else {
              return Integer.MIN_VALUE;
        }
    }
    static  boolean isContinue(Scanner sc){
        String choose = sc.next();
        return !choose.equalsIgnoreCase("no");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running=true;
        while(running) {
            showMenu();

            int choice = sc.nextInt();
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int answer = result(choice, num1, num2);
            if (answer == Integer.MIN_VALUE) {
                System.out.println("Invalid Input");
            }
            System.out.println("Result"+answer);
            System.out.println("Yes/No");
           running= isContinue(sc);
        }
    }
}
