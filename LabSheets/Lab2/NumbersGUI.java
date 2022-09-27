package Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumbersGUI {
    static JFrame frame = new JFrame("Numbers GUI");
    static JPanel panel = new JPanel();
    static JTextField input = new JTextField(20);
    static JLabel label = new JLabel("Please enter your numbers here");
    static JLabel output = new JLabel("No numbers entered yet");
    public static void main(String[] args) {

        frame.setSize(500,100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(new FlowLayout());

        panel.add(label);
        panel.add(input);
        panel.add(output);


        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (input.getText().equals("")) {
                    JOptionPane.showMessageDialog(
                            null,
                            "You must enter something",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                String userInputText = input.getText();

                output.setText(userInputText);
            }
        });


//        output.setText(userInputText);

        frame.add(panel);

        frame.setVisible(true);
    }
}
