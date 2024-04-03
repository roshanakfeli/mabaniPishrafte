package calculator;

import javax.swing.*;

public class CalculatorUI {
    private static final int WIDTH = 45; // sabet
    private static final int HEIGHT = 45;
    private static JTextField JText;
    private static String Number1;
    private static String result;

     public static void main(String[] args){
        JFrame mashinHesab = new JFrame("Mashin Hesab");

        JText = new JTextField();
        JText.setBounds(0,0,150,HEIGHT);
        JText.setEditable(false);

        JButton cancel = new JButton("C");
        cancel.setBounds(150, 0, WIDTH, HEIGHT);
        cancel.addActionListener(event -> JText.setText(""));

        JButton one = getButton("1", 0, 50);
        JButton two = getButton("2", 50, 50);

        JButton three = getButton("3", 100, 50);

        JButton plus = new JButton("+");
        plus.setBounds(150, 50, WIDTH, HEIGHT);
        plus.addActionListener(event -> {
            Number1 = JText.getText();
            JText.setText("");
        });

        JButton four = getButton("4", 0, 100);
        JButton five = getButton("5", 50, 100);
        JButton six = getButton("6", 100, 100);

        JButton minus = new JButton("-");
        minus.setBounds(150, 100, WIDTH, HEIGHT);

        JButton seven = getButton("7", 0, 150);
        JButton eight = getButton("8", 50, 150);

        JButton nine = getButton("9", 100, 150);

        JButton multiply = new JButton("x");
        multiply.setBounds(150, 150, WIDTH, HEIGHT);

        JButton point = new JButton(".");
        point.setBounds(0, 200, WIDTH, HEIGHT);
        point.addActionListener(event -> {
//            if(JText.getText().contains(".")){
//            } else {
//            }
                JText.setText(JText.getText() + point.getText());
        });

        JButton zero = getButton("0", 50, 200);

        JButton equal = new JButton("=");
        equal.setBounds(100, 200, WIDTH, HEIGHT);
        equal.addActionListener(event -> {
            final Calculator calculator = new Calculator();
            String result = calculator.add(Number1, JText.getText());
            JText.setText(result);
        });

        JButton division = new JButton("/");
        division.setBounds(150, 200, WIDTH, HEIGHT);


        mashinHesab.add(JText);
        mashinHesab.add(cancel);
        mashinHesab.add(one);
        mashinHesab.add(two);
        mashinHesab.add(three);
        mashinHesab.add(plus);
        mashinHesab.add(four);
        mashinHesab.add(five);
        mashinHesab.add(six);
        mashinHesab.add(minus);
        mashinHesab.add(seven);
        mashinHesab.add(eight);
        mashinHesab.add(nine);
        mashinHesab.add(multiply);
        mashinHesab.add(point);
        mashinHesab.add(zero);
        mashinHesab.add(equal);
        mashinHesab.add(division);

        mashinHesab.setSize(600, 600);
        mashinHesab.setLayout(null);
        mashinHesab.setVisible(true);
    }

    private static JButton getButton(String label, int x, int y) {
        JButton button = new JButton(label);
        button.setBounds(x, y, WIDTH, HEIGHT);
        button.addActionListener(event -> JText.setText(JText.getText() + button.getText()));
        return button;
    }
}
