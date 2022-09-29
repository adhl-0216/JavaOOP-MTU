package Lab2;

import javax.swing.*;
import java.util.*;

public class ComputerData {
    public static void main(String[] args) {
        try {
            List<String> allSerial = new ArrayList<>();
            List<Integer> allStorage = new ArrayList<>();
            List<String> allCpu = new ArrayList<>();
            List<Double> allPrice = new ArrayList<>();
            int iter = 0;

            do {
                String serial;
                String storage;
                String cpu;
                String price;

                serial = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit): ");
                if (Objects.equals(serial.toLowerCase(Locale.ROOT), "cr")){
                    JOptionPane.showMessageDialog(null, "Exited Program") ;
                    break;
                }else {
                    allSerial.add(serial);
                }

                storage = JOptionPane.showInputDialog("Please enter the hard-disk space: ");

                boolean valid = false;
                while (!valid) {
                    for (int i = 0; i < storage.length(); i++) {
                        if (!Character.isDigit(storage.charAt(i))) {
                            valid = true;
                            break;
                        }
                    }
                    storage = JOptionPane.showInputDialog("Invalid! Please re-enter the hard-disk space: ");

                }
                allStorage.add(Integer.parseInt(storage));

                cpu = JOptionPane.showInputDialog("Please enter the processor type: ");
                allCpu.add(cpu);

                price = JOptionPane.showInputDialog("Please enter the price");
                allPrice.add(Double.parseDouble(price));

                iter++;
            } while (true);

            System.out.println(allSerial);
            System.out.println(allStorage);
            System.out.println(allCpu);
            System.out.println(allPrice);
            System.out.println(iter);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Task failed successfully.");
        }
    }
}
