package Lab2;

import javax.swing.*;
import java.util.Arrays;

public class NamesArray {
    static String[] names = new String[5];
    public static void main(String[] args) {
        populateArray();
        System.out.println(Arrays.toString(names));
    }
    private static void populateArray() {
        for (int i = 0; i < 5; i++) {
            String[] ENGLISH ={"first","second","third","forth","fifth"};
            String msg = String.format(" Please enter the name of the %s person",ENGLISH[i]);
            names[i] = JOptionPane.showInputDialog(msg);
        }
    }


}
