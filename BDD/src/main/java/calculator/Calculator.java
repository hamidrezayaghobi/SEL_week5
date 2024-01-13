package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int calculateResult(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by ZERO?!");
        }
        if (b * a < 0) {
            throw new ArithmeticException("one of then is negative");
        }
        double res = Math.sqrt((double) a /b);
        return (int) (Math.floor(res));
    }
}