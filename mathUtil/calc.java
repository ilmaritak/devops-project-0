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
    }
}
