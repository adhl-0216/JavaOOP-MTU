package Lab4.exercise5;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output ="";
        String title;
        double price;
        String ISBN;
        int pages;

        title = JOptionPane.showInputDialog("Please enter the title of your favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages of your favourite book"));

        Book favBook = new Book(title,price,ISBN,pages);

        title = JOptionPane.showInputDialog("Please enter the title of your least-favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least-favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your least-favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages of your least-favourite book"));


        Book leastFavBook = new Book(title, price, ISBN, pages);
        output += "Calling the no-argument Book constructor. "
                + "The first Book object details are: \n\n"
                +favBook;

        output += "\n\nCalling the no-argument Book constructor. "
                + "The second Book object details are: \n\n"
                + leastFavBook;

        JOptionPane.showMessageDialog(null,output,"Book Object Data", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
