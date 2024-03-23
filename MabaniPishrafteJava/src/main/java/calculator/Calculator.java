package calculator;

public class Calculator {
    public String add(final String num1, final String num2) {
        final double d1 = Double.parseDouble(num1);
        final double d2 = Double.parseDouble(num2);
        final double result = d1 + d2;
        return String.valueOf(result);
    }
}
