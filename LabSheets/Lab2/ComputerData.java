package Lab2;

import java.util.*;

public class ComputerData {
    public static void main(String[] args) {
        try {
            Scanner line = new Scanner(System.in);
            List<String> allSerial = new ArrayList<>();
            List<Integer> allStorage = new ArrayList<>();
            List<String> allCpu = new ArrayList<>();
            List<Double> allPrice = new ArrayList<>();
            int iter = 0;

            do {
                String serial;
                int storage;
                String cpu;
                double price;

                System.out.println("Please enter the serial number (<CR> to exit): ");
                serial = line.nextLine();
                if (Objects.equals(serial.toLowerCase(Locale.ROOT), "cr")){
                    System.out.println("EXITED PROGRAM");
                    break;
                }else {
                    allSerial.add(serial);
                }

                System.out.println("Please enter the hard-disk space: ");
                String scn = line.nextLine();

                for () {

                }


//                if(line.hasNextInt()){
//                    storage = Integer.parseInt(line.nextLine());
//                    if(storage<= 50 || storage>=5000){
//                        System.out.println("Invalid! Please re-enter the hard-disk space: ");
//
//                    }
//                }
//                else {
//                    System.out.println("Invalid! Please re-enter the hard-disk space: ");
//                }

//
//                storage = Integer.parseInt(scn);
                storage = line.nextInt();

                allStorage.add(storage);

                System.out.println("Please enter the processor type: ");
                cpu = line.nextLine();
                allCpu.add(cpu);

                System.out.println("Please enter the price");
//                price = Double.parseDouble(line.nextLine());
                price = line.nextDouble();
                line.nextLine();
                allPrice.add(price);

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
