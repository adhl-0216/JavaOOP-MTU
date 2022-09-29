package Lab4.exercise3;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output ="";
        Book b1 = new Book();

        output += "Calling the no-argument Book constructor. "
                + "The first Book object details are: \n\n"
                + b1;

        Book b2 = new Book("The Davinci Code",19.99,"345617232",348);

        output += "\n\nCalling the no-argument Book constructor. "
                + "The second Book object details are: \n\n"
                + b2;

        JOptionPane.showMessageDialog(null,output,"Book Object Data", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
