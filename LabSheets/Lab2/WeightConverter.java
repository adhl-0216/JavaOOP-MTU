package Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class WeightConverter {

    private static JLabel poundsLabel = new JLabel("Pounds: ");
    private static JLabel kgLabel = new JLabel("");
    private static final JTextField poundsText = new JTextField(5);

    public static void main(String[] args) {
//        JLabel labelKilos = new JLabel(String.format( "This is equivalent to %.2fkg", kg));
        prepareGUI();
    }

    private static void prepareGUI() {

        JFrame frame = new JFrame("Weight Converter");
        JPanel panel = new JPanel();

        frame.setSize(300,100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(new FlowLayout());
        panel.add(poundsLabel);
        panel.add(poundsText);
        panel.add(kgLabel);

        poundsText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (poundsText.getText().equals("")) {
                    JOptionPane.showMessageDialog(null,"You must enter a value into the textfield","Error",JOptionPane.ERROR_MESSAGE);
                } else {
                    double kg;
                    kg = Double.parseDouble(poundsText.getText())*0.454;
                    kgLabel.setText("This is equal to " + String.format("%.2f",kg) + "kg");
                }
            }
        });

        frame.add(panel);


        frame.setVisible(true);
    }
}

