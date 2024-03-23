package calculator;

public class Calculator {
    public String add(String num1, String num2) {
        double d1 = Double.parseDouble(num1);
        double d2 = Double.parseDouble(num2);
        double result = d1 + d2;
        return String.valueOf(result);
    }
}
