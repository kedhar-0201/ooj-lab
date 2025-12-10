import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DivisionCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Integer Division Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("Num1:");
        JTextField num1Field = new JTextField(10);
        JLabel label2 = new JLabel("Num2:");
        JTextField num2Field = new JTextField(10);
        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false); 
        JButton divideButton = new JButton("Divide");
        frame.add(label1);
        frame.add(num1Field);
        frame.add(label2);
        frame.add(num2Field);
        frame.add(divideButton);
        frame.add(resultLabel);
        frame.add(resultField);
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String num1Text = num1Field.getText();
                    String num2Text = num2Field.getText();
                    int num1 = Integer.parseInt(num1Text);
                    int num2 = Integer.parseInt(num2Text);
                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                  
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers in both fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                   
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero.", "Math Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.setVisible(true);
    }
}
