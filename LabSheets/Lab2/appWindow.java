package Lab2;

import javax.swing.*;
import java.awt.*;

public class appWindow {

    String title;
    int[] frameSize;
    int userInputCols;
    String lblText;
    String outputDefaultText;

    private String userInputText;

    public appWindow(){
        title = "Title";
        frameSize = new int[]{100, 100};
        userInputCols = 5;
        lblText = "Enter something";
        outputDefaultText = "";
    }
    public appWindow(
            String title,
            int[] frameSize,
            String lblText,
            String outputDefaultText
    ){
        this.title = title;
        this.frameSize = frameSize;
        this.lblText = lblText;
        this.outputDefaultText = outputDefaultText;
        this.userInputText = "";
    }

    public void inputField(String title, int colSize){
        JTextField input = new JTextField(colSize);
        JLabel label = new JLabel(title);

        panel.add(label);
        panel.add(input);

        input.addActionListener(e -> {
            if (input.getText().equals("")) {
                JOptionPane.showMessageDialog(
                        null,
                        "You must enter something",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            this.userInputText = input.getText();

        });

        frame.add(panel);
        frame.setVisible(true);
    }

    static JPanel panel = new JPanel();
    static JFrame frame;

    public void prepareGUI() {

        JFrame frame = new JFrame(this.title);

        frame.setSize(this.frameSize[0],this.frameSize[1]);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(new FlowLayout());

//        inputField(this.userInputText , userInputCols);

        frame.add(panel);

        frame.setVisible(true);
    }
}
