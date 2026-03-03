package mathUtil;

import java.util.Scanner;

public class calc {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give number 1:");
        String num1 = scan.nextLine();
        System.out.println("Give operator (+, -, *, /):");
        String op = scan.nextLine();
        System.out.println("Give number 2:");
        String num2 = scan.nextLine();
        Float tulos = 0.0f;
        if (op.equals("+")) {
            tulos = Float.parseFloat(num1) + Float.parseFloat(num2);
        } else if (op.equals("-")) {
            tulos = Float.parseFloat(num1) - Float.parseFloat(num2);
        } else if (op.equals("*")) {
            tulos = Float.parseFloat(num1) * Float.parseFloat(num2);
        } else if (op.equals("/")) {
            tulos = Float.parseFloat(num1) / Float.parseFloat(num2);
        }
    }
}
