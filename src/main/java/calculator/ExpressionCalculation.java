package main.java.calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExpressionCalculation implements Calculation {
    private static final ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
    private static final ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");

    public static void calculate() {
        try {
            Object expResult1 = scriptEngine.eval(InputReader.getExpression());
            System.out.println("result = " + expResult1);
        } catch (ScriptException scriptException) {
            System.out.println("incorrect expression");
        }
    }
}
