package main.java.calculator;

import java.util.Scanner;

public class InputReader {
    static private String expression;

    public static String getExpression() {
        return expression;
    }

    public static void readExpression() {
        Scanner input = new Scanner(System.in);
        expression = input.nextLine();
    }

}
