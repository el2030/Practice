package Folder1;

import java.util.Scanner;

public class TwoNumberOperation {
    public static void main(String[] args) {
        int num1;
        int num2;
        int result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        String s = sc.nextLine();
        num1 = Integer.parseInt(s);

        System.out.println("Please enter your second number: ");
        s = sc.nextLine();
        num2 = Integer.parseInt(s);

        System.out.println("Please enter your operator: ");
        s = sc.nextLine();
        result = Calculator(num1, num2, s);
        System.out.println("Result is: "+result);

    }

    public static int Calculator(int num1, int num2, String op){
        return switch (op) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> 0;
        };

    }
}
