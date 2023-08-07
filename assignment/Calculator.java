import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {

    Label displayLabel, resultLabel;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonPlus, buttonEqual, buttonClear, buttonDivide, buttonMultiply, buttonSubtract;
    double previousValue = 0, currentValue = 0;
    String operator = " ";

    Calculator() {

        displayLabel = new Label();
        resultLabel = new Label();
        button1 = new Button("1");
        button2 = new Button("2");
        button3 = new Button("3");
        button4 = new Button("4");
        button5 = new Button("5");
        button6 = new Button("6");
        button7 = new Button("7");
        button8 = new Button("8");
        button9 = new Button("9");
        button0 = new Button("0");
        buttonPlus = new Button("+");
        buttonEqual = new Button("=");
        buttonClear = new Button("C");
        buttonDivide = new Button("/");
        buttonMultiply = new Button("*");
        buttonSubtract = new Button("-");

        add(displayLabel);
        add(resultLabel);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button0);
        add(buttonPlus);
        add(buttonEqual);
        add(buttonClear);
        add(buttonDivide);
        add(buttonMultiply);
        add(buttonSubtract);

        displayLabel.setBounds(20, 40, 200, 30);
        resultLabel.setBounds(20, 60, 200, 30);
        button1.setBounds(20, 100, 50, 50);
        button2.setBounds(80, 100, 50, 50);
        button3.setBounds(140, 100, 50, 50);
        button4.setBounds(20, 160, 50, 50);
        button5.setBounds(80, 160, 50, 50);
        button6.setBounds(140, 160, 50, 50);
        button7.setBounds(20, 220, 50, 50);
        button8.setBounds(80, 220, 50, 50);
        button9.setBounds(140, 220, 50, 50);
        button0.setBounds(20, 280, 50, 50); 
        buttonPlus.setBounds(200, 100, 50, 50);
        buttonEqual.setBounds(200, 280, 50, 50); 
        buttonClear.setBounds(80, 280, 50, 50); 
        buttonDivide.setBounds(200, 160, 50, 50);
        buttonMultiply.setBounds(200, 220, 50, 50);
        buttonSubtract.setBounds(140, 280, 50, 50);

        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonSubtract.addActionListener(this);

        setSize(280, 350);
        setLayout(null);
        setVisible(true);
        setTitle("Calculator");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        String currentDisplayValue = displayLabel.getText();

        if (command.matches("[0-9]")) {
            displayLabel.setText(currentDisplayValue + command);
        } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            previousValue = Double.parseDouble(currentDisplayValue);
            operator = command;
            resultLabel.setText(previousValue + " " + operator + " ");
            displayLabel.setText("");
        } else if (command.equals("=")) {
            currentValue = Double.parseDouble(currentDisplayValue);
            String result = calculateResult(previousValue, operator, currentValue);
            resultLabel.setText(" ");
            displayLabel.setText(String.valueOf(result));
            try{previousValue = Double.parseDouble(result);}catch(Exception e){
                previousValue = 0;
            }
        } else if (command.equals("C")) {
            displayLabel.setText("");
            resultLabel.setText("");
            previousValue = 0;
            currentValue = 0;
            operator = " ";
        }
    }

    private String calculateResult(double num1, String operator, double num2) {
        String result = "";
        System.out.println(num2);
        switch (operator) {
            case "+":
                result = String.valueOf(num1 + num2);
                break;
            case "-":
                result = String.valueOf(num1 - num2);
                break;
            case "*":
                result = String.valueOf(num1 * num2);
                break;
            case "/":
                if (num2 != 0) {
                    result = String.valueOf(num1 / num2);
                } else {
                    result = "Cannot divide by zero";
                }
                break;
        }
        return result;
    }
    

    public static void main(String args[]) {
        Calculator c = new Calculator();
    }
}
