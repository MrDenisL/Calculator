package main.java.calculator;

public interface Calculation {
    static void calculate() {
        System.out.println("Your Expression is:" + InputReader.getExpression());
    }
}
