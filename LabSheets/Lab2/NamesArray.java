package Lab2;

import javax.swing.*;
import java.util.Arrays;

public class NamesArray {
    static String[] names = new String[5];
    public static void main(String[] args) {
        double avgLen = 0;
        String longest = "";
        populateArray();
        for (String str: names) {
            if (longest.length() == 0) longest = str;
            else if (longest.length() < str.length()) longest = str;
            avgLen += str.length();
        }
        Arrays.sort(names);
        avgLen = Math.round(avgLen/5);

        JOptionPane.showMessageDialog(null,"The longest name is " + longest +
                "\nAverage character per name is " + (int)avgLen +
                "\nThe array sorted in ascending order is \n" +
                Arrays.toString(names));
    }
    private static void populateArray() {
        for (int i = 0; i < 5; i++) {
            String[] ENGLISH ={"first","second","third","forth","fifth"};
            String msg = String.format(" Please enter the name of the %s person",ENGLISH[i]);
            names[i] = JOptionPane.showInputDialog(msg);
        }
    }
}
