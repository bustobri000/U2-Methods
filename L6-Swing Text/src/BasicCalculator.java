import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */
    public static JTextField inputNumber1 = new JTextField("");
    public static JTextField inputNumber2 = new JTextField("");
    public static JLabel resultLabel = new JLabel("");

    public static void main(String[] args) {
        JFrame window = new JFrame("calculatormation");
        JPanel panel = new JPanel();

        JLabel label1 = new JLabel("Enter a number:");
        JLabel label2 = new JLabel("Enter a number:");
        inputNumber1 = new JTextField(10);
        inputNumber2 = new JTextField(10);

        JButton add = new JButton("Add");
        JButton subtract = new JButton("Subtract");
        JButton multiply = new JButton("multiply");
        JButton divide = new JButton("Division");

        resultLabel = new JLabel("0.00");

        window.setSize(500, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(add);
        panel.add(subtract);
        panel.add(multiply);
        panel.add(divide);

        panel.add(label1);
        panel.add(inputNumber1);
        panel.add(label2);
        panel.add(inputNumber2);
        panel.add(resultLabel);

        add.addActionListener(new addListener());
        subtract.addActionListener(new subListener());
        multiply.addActionListener(new mulListener());
        divide.addActionListener(new divListener());

        window.add(panel);
        window.setVisible(true);
    }
    private static class addListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(inputNumber1.getText());
            double number2 = Double.parseDouble(inputNumber2.getText());

            resultLabel.setText(String.valueOf(number1 + number2));
        }
    }
    private static class subListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(inputNumber1.getText());
            double number2 = Double.parseDouble(inputNumber2.getText());

            resultLabel.setText(String.valueOf(number1 - number2));
        }
    }    private static class mulListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(inputNumber1.getText());
            double number2 = Double.parseDouble(inputNumber2.getText());

            resultLabel.setText(String.valueOf(number1 * number2));
        }
    }    private static class divListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(inputNumber1.getText());
            double number2 = Double.parseDouble(inputNumber2.getText());

            resultLabel.setText(String.valueOf(number1 / number2));
        }
    }
}
