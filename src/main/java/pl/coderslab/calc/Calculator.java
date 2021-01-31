package pl.coderslab.calc;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (Math.abs(b) < .000000001) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    public boolean greater(double a, double b) {
        return a > b;
    }


    public int eval(String mathExpression) {
        Pattern pat = Pattern.compile("^([0-9]+)([+][0-9]+)+$");
        Matcher mat = pat.matcher(mathExpression);

        if (!mat.matches()) {
            throw new IllegalArgumentException("Expression cannot be parsed");
        }

        String[] split = mathExpression.split("\\+");
        int sum = Arrays.stream(split)
                .mapToInt(Integer::valueOf)
                .sum();
        return sum;
    }


}
