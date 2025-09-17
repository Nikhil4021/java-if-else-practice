package ifelseladderproblemsintermediate;

import java.util.Scanner;

public class SimpleCalculatorTwoInputs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueCalc;

        do {
            System.out.println("Enter the first number: ");
            int number1 = sc.nextInt();

            System.out.println("Enter the second number: ");
            int number2 = sc.nextInt();

            sc.nextLine(); // clear buffer

            System.out.println("Enter the operator to perform the calculation (+, -, /, x): ");
            String symbol = sc.nextLine();

            if (symbol.equals("+")) {
                int sum = number1 + number2;
                System.out.println("The sum (+) of " + number1 + " and " + number2 + " is equal to: " + sum);
            } else if (symbol.equals("-")) {
                int diff = number1 - number2;
                System.out.println("The difference (-) of " + number1 + " and " + number2 + " is equal to: " + diff);
            } else if (symbol.equals("/")) {
                if (number2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                } else {
                    int division = number1 / number2;
                    System.out.println("The division (/) of " + number1 + " and " + number2 + " is equal to: " + division);
                }
            } else if (symbol.equals("x") || symbol.equals("*")) {
                int multiply = number1 * number2;
                System.out.println("The multiplication (x) of " + number1 + " and " + number2 + " is equal to: " + multiply);
            } else {
                System.out.println("Invalid operator entered. Please enter +, -, /, or x.");
            }

            System.out.println("\nDo you want to perform another calculation? (yes/no): ");
            continueCalc = sc.nextLine().trim().toLowerCase();

        } while (continueCalc.equals("yes"));

        System.out.println("Thank you for using the calculator!");
        sc.close();
    }
}
