package Lab5.exercise1;

import Lab4.exercise3.Book;

import javax.swing.*;
import Lab3.exercise1.Computer;
public class TestBook {
    public static void main(String[] args) {
        String output ="";
        Lab4.exercise3.Book b1 = new Lab4.exercise3.Book();

        output += "Calling the no-argument Book constructor. "
                + "The first Book object details are: \n\n"
                + b1;

        Lab4.exercise3.Book b2 = new Book("The Davinci Code",19.99,"345617232",348);

        output += "\n\nCalling the no-argument Book constructor. "
                + "The second Book object details are: \n\n"
                + b2;

        JOptionPane.showMessageDialog(null,output,"Book Object Data", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
