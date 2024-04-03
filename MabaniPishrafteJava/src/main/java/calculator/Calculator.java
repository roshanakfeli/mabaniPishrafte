package calculator;

public class Calculator {
    public String add(final String num1, final String num2) {
        double d1, d2;
        try {
            d1 = Double.parseDouble(num1);
            d2 = Double.parseDouble(num2);
        } catch (NumberFormatException nfe){
            System.out.println("عدد وارد شده قابل قبول نیست.");
            throw nfe;
        } finally {
            System.out.println("لطفا دوباره امتحان کنید.");
        }
//        final double d1 = Double.parseDouble(num1);
        final double result = d1 + d2;
        return String.valueOf(result);
    }
}
