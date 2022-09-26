package Lab2;

import javax.swing.*;
import java.awt.*;

public class appWindow {

    private String title;
    private int[] frameSize;
    private int userInputCols;
    private String lblText;
    private String outputDefaultText;

    private String userInputText;
    public static JTextField userInput;
    public static JLabel output ;


    public appWindow(
            String title,
            int[] frameSize,
            int userInputCols,
            String lblText,
            String outputDefaultText
    ){
        this.title = title;
        this.frameSize = frameSize;
        this.userInputCols = userInputCols;
        this.lblText = lblText;
        this.outputDefaultText = outputDefaultText;
        this.userInputText = "empty";
    }

    public appWindow(){
        title = "Title";
        frameSize = new int[]{100, 100};
        userInputCols = 5;
        lblText = "Enter something";
        outputDefaultText = "";
    }

    public String getUserInputText(){return userInputText;}

    public void prepareGUI() {

        JFrame frame = new JFrame(this.title);
        JPanel panel = new JPanel();

        frame.setSize(this.frameSize[0],this.frameSize[1]);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(this.lblText);
        userInput = new JTextField(this.userInputCols);
        output = new JLabel(this.outputDefaultText);

        panel.setLayout(new FlowLayout());
        panel.add(label);
        panel.add(userInput);
        panel.add(output);

        userInput.addActionListener(e -> {
            if (userInput.getText().equals("")) {
                JOptionPane.showMessageDialog(
                        null,
                        "You must enter something",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                this.userInputText = userInput.getText();
            }
        });

        frame.add(panel);

        frame.setVisible(true);
    }
}
