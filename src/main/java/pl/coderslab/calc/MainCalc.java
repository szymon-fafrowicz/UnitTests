package pl.coderslab.calc;

public class MainCalc {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        String expression = "1+2+4+3+5";
        int eval = calculator.eval(expression);



    }
}
