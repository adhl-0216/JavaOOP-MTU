package Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//create frame

public class WeightConverter {
    private static JFrame mainFrame;
    private static JLabel statusLabel;
    private static JPanel controlPanel;
    public static void main(String[] args) {
        double kg = 0;

//        JLabel labelKilos = new JLabel(String.format( "This is equivalent to %.2fkg", kg));
        inputField();
        prepareGUI();


    }

    private static void prepareGUI() {
        mainFrame = new JFrame("Weight Converter");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(300, 100);
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        statusLabel = new JLabel("",JLabel.CENTER);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private static void inputField(){
        JLabel poundsLabel = new JLabel("Pounds: ");
        final JTextField poundsText = new JTextField(5);

        poundsText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = poundsText.getText();
                statusLabel.setText(data);
            }
        });
        controlPanel.add(poundsLabel);
        controlPanel.add(poundsText);
        mainFrame.setVisible(true);
    }

}

