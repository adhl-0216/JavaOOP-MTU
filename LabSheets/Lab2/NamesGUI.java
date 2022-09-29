package Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class NamesGUI {
    String[] names = new String[5];
    JTextField jTextField;

    JLabel output;

    JButton searchBtn, findMaxLenBtn;

    JFrame frame = new JFrame("Student Names");


    static int idx = 0;

    TextFieldEventHandler textFieldEventHandler = new TextFieldEventHandler();

    public NamesGUI(){
        frame.setSize(500,100);
        FlowLayout flowLayout = new FlowLayout();
        frame.setLocationRelativeTo(null);
        frame.setLayout(flowLayout);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel prompt = new JLabel("Name");
        jTextField = new JTextField(20);
        output = new JLabel("The names array is currently empty!" +
                " Add names using text-field above");

        jTextField.addActionListener(textFieldEventHandler);

        searchBtn = new JButton("Search");
        searchBtn.addActionListener(e -> {
            String query = jTextField.getText().replaceAll("\\s+", "");

            String msg = "The name you searched for, " + query;
            String title = "Name";
            int msgType;

            if (binarySearch(names, query)) {
                title += " Found!";
                msg += ", was found!";
                msgType = 1;
            }
            else {
                title += " Not Found!";
                msg += ", was not found!";
                msgType = 0;
            }

            JOptionPane.showMessageDialog(null,msg,title,msgType);

            jTextField.setText("");
        });
        searchBtn.setVisible(false);

        findMaxLenBtn = new JButton("Find Longest Name");
        findMaxLenBtn.addActionListener(e -> {
            int len = 0;
            String longestName = "";
            for (String name: names) {
                if (name.replaceAll("\\s+", "").length() > len){
                    len = name.replaceAll("\\s+", "").length();
                    longestName = name;
                }
            }
            JOptionPane.showMessageDialog(null,"The longest name found is "+longestName,"Longest Name!", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("click2");
        });
        findMaxLenBtn.setVisible(false);

        frame.add(prompt);
        frame.add(jTextField);
        frame.add(output);
        frame.add(searchBtn);
        frame.add(findMaxLenBtn);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        NamesGUI app = new NamesGUI();
    }

    private boolean binarySearch(String[]strArr, String query){
        int l = 0, r = strArr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            int res = query.compareTo(strArr[m].replaceAll("\\s+", ""));

            if (res == 0)
                return true;

            if (res > 0)
                l = m + 1;

            else
                r = m - 1;
        }

        return false;
    }

    private class TextFieldEventHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                if (idx == 4){
                    names[idx] = (jTextField.getText());
                    jTextField.setText("");
                    JOptionPane.showMessageDialog(null,
                            "names array now full! To find the longest name or search this array hit return",
                            "Array Full!", JOptionPane.INFORMATION_MESSAGE);
                    jTextField.setText("");
                    output.setVisible(false);
                    searchBtn.setVisible(true);
                    findMaxLenBtn.setVisible(true);
                    frame.setSize(600,100);

                    Arrays.sort(names);
                    jTextField.removeActionListener(textFieldEventHandler);
                }
                else{
                    names[idx] = jTextField.getText();
                    jTextField.setText("");
                    String outputStr = "Name Added! " + (4-idx) + " slots of the array remain empty";
                    output.setText(outputStr);
                }
                idx++;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex);
            }
        }
    }
}
