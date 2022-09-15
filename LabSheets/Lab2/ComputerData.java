package Lab2;

import java.util.List;
import java.util.Scanner;

public class ComputerData {
    public static void main(String[] args) {
        try {
            Scanner line = new Scanner(System.in);
            String serial;
            int storage;
            String cpu;
            double price;

            System.out.println("Please enter the serial number (<CR> to exit): ");
            serial = line.nextLine();
            System.out.println("Please enter the hard-disk space: ");
            storage = line.nextInt();
            System.out.println("Please enter the processor type: ");
            cpu = line.nextLine();
            System.out.println("Please enter the price");
            price = line.nextDouble();

            System.out.println(serial);
            System.out.println(storage);
            System.out.println(cpu);
            System.out.println(price);

        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Task failed successfully.");
        }
    }
}
