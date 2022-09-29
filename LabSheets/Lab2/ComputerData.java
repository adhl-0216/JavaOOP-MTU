package Lab2;

import javax.swing.*;
import java.util.*;

public class ComputerData {

    private static boolean digitValidation(String bs){
        boolean valid = false;
        while (!valid) {
            for (int i = 0; i < bs.length(); i++) {
                if (!Character.isDigit(bs.charAt(i))) {
                    bs = JOptionPane.showInputDialog("Invalid! Please re-enter the price: ");
                }else valid = true;
            }
        }
        return true;
    }

    private static boolean validRange(String target){
        boolean valid = false;
        int bs = Integer.parseInt(target);
        while(!valid) {
            if (bs < 50 || bs > 500) {
                bs = Integer.parseInt(JOptionPane.showInputDialog("Invalid! Please re-enter the hard-disk space: "));
            }else valid = true;
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            int iter = 0;
            int storageAsInt = 0;
            int allStorage = 0;
            double minPrice = Double.MAX_VALUE , maxPrice = Double.MIN_VALUE;
            String cheapestCPU = "";

            do {
                String serial;
                String storage;
                String cpu;
                String price;

                serial = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit): ");
                if (Objects.equals(serial.toLowerCase(Locale.ROOT), "cr")) {
                    JOptionPane.showMessageDialog(null, "Exited Program");
                    break;
                }

                storage = JOptionPane.showInputDialog("Please enter the hard-disk space: ");
                boolean valid = false;
                while (!valid) {
                    int i;
                    for (i = 0; i < storage.length(); i++) {
                        if (!Character.isDigit(storage.charAt(i))) {
                            break;
                        }
                    }
                    if(i < storage.length())
                        storage = JOptionPane.showInputDialog(
                                "Invalid! Please re-enter hard-disk space");
                    else
                    {
                        storageAsInt = Integer.parseInt(storage);

                        if (storageAsInt > 50 && storageAsInt < 5000)
                            valid = true;
                        else
                            storage = JOptionPane.showInputDialog(
                                    "Invalid! Please re-enter hard-disk space");
                    }
                }
                allStorage+= storageAsInt;

                cpu = JOptionPane.showInputDialog("Please enter the processor type: ");

                price = JOptionPane.showInputDialog("Please enter the price: ");
                double currPrice = 0;
                if(digitValidation(price)) {
                    currPrice = Double.parseDouble(price);
                }
                if (currPrice > maxPrice) maxPrice = currPrice;
                if (currPrice < minPrice) {
                    minPrice = currPrice;
                    cheapestCPU = cpu;
                }

                iter++;
            } while (true);

            String outputStr = String.format(
                        """
                        The average disk space available on the computers processed is: %dGB
                        The price range of the computers is from \u20ac%.2f to \u20ac%.2f
                        The processor type on the cheapest computer is %s
                        """,
                    allStorage/iter,minPrice, maxPrice, cheapestCPU);
            JOptionPane.showMessageDialog(null,outputStr,"Computer Stats", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Task failed successfully.");
        }
    }
}
