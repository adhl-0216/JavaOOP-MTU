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
    }

    public String getUserInputText(){
        return this.userInputText;
    }

    static         JPanel panel = new JPanel();
    static         JLabel output = new JLabel();

    static JFrame frame = new JFrame();


    public void prepareGUI() {
        frame.setName(this.title);

        frame.setSize(this.frameSize[0],this.frameSize[1]);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(new FlowLayout());

        output.setText(this.userInputText);

        panel.add(output);

        frame.add(panel);

        frame.setVisible(true);
    }
}
