package main.java.calculator;

public class TerminalInterface {
    public static void output() {
        loop:
        while (true) {
            System.out.println("For exit write 'exit' instead of expression");
            System.out.println("Enter Your Expression");
            InputReader.readExpression();
            switch (InputReader.getExpression()) {
                case "exit":
                    break loop;
                case "":
                    System.out.println("No expression entered");
                default:
                    ExpressionCalculation.calculate();
            }
        }
    }
}
