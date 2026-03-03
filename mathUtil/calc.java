package mathUtil;

import java.util.Scanner;

// Version: 1.0.0

/**
 * Simple console calculator.
 */
public class calc {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give first number:");
        String num1 = scan.nextLine().trim();
        System.out.println("Give operator (+, -, *, /):");
        String op = scan.nextLine().trim();
        System.out.println("Give second number:");
        String num2 = scan.nextLine().trim();
        float f1 = Float.parseFloat(num1);
        float f2 = Float.parseFloat(num2);
        Float tulos = 0.0f;
        if (op.equals("+")) {
            tulos = f1 + f2;
        } else if (op.equals("-")) {
            tulos = f1 - f2;
        } else if (op.equals("*")) {
            tulos = f1 * f2;
        } else if (op.equals("/")) {
            tulos = f1 / f2;
            if (Float.isInfinite(tulos)) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Error: Invalid operator.");
        }
        System.out.println("Result: " + tulos);
        System.out.println("Calculation complete.");
    }
}
