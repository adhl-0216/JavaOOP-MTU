package Lab8.exercise2;

import javax.swing.*;

public class TestVehicle {
    public static void main(String[] args) {
/*        Car c1 =  new Car();
        System.out.println(c1+"\n\n");
        Bicycle b1 =  new Bicycle();
        System.out.println(b1+"\n\n");*/
        String reg = JOptionPane.showInputDialog("reg");
        Car c2 =  new Car(
                10000,
                4.5,
                1.25,
                2000,
                "Ferrari",
                "F2",
                2,
                reg);
        System.out.println(c2+"\n\n");
/*        Bicycle b2 =  new Bicycle(500,1.5,1.0,50, "Raleigh", "Mountainbike", 4, true);
        System.out.println(b2);*/
    }
}
