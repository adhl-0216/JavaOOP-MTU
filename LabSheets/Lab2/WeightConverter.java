package Lab2;

import javax.swing.*;
import java.awt.*;

public class WeightConverter {

    private static JLabel kgLabel;
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

        JLabel poundsLabel = new JLabel("Pounds: ");
        kgLabel = new JLabel("");

        panel.setLayout(new FlowLayout());
        panel.add(poundsLabel);
        panel.add(poundsText);
        panel.add(kgLabel);

        poundsText.addActionListener(e -> {
            if (poundsText.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"You must enter a value into the text-field","Error",JOptionPane.ERROR_MESSAGE);
            } else {
                double kg;
                kg = Double.parseDouble(poundsText.getText())*0.454;
                kgLabel.setText("This is equal to " + String.format("%.2f",kg) + "kg");
            }
        });

        frame.add(panel);


        frame.setVisible(true);
    }
}

