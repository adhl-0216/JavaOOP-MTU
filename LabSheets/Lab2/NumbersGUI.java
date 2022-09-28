package Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumbersGUI {
    JLabel minNum, maxNum;
    JTextField jTextField;

    float largest=-1e38f,smallest=1e38f;
    public NumbersGUI() {

        JFrame frame = new JFrame("Numbers GUI");
        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        frame.setSize(500,100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Please enter your numbers here");

        maxNum = new JLabel("No numbers entered yet");
        minNum = new JLabel();

        jTextField = new JTextField(20);

        frame.add(label);
        frame.add(jTextField);

        frame.add(maxNum);
        frame.add(minNum);

        jTextField.addActionListener(new TextFieldEventHandler());

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        NumbersGUI numbersGUI = new NumbersGUI();
    }

    private class TextFieldEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            float number;
            String numberAsString;

            if(jTextField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"You must enter something!!!","Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                numberAsString = jTextField.getText();
                jTextField.setText("");
                number = Float.parseFloat(numberAsString);

                if(number>largest)
                    largest = number;

                if (number<smallest)
                    smallest = number;

                maxNum.setText("Largest number so far is: " + largest);
                minNum.setText("Smallest number so far is: " + smallest);

            }
        }
    }
}
