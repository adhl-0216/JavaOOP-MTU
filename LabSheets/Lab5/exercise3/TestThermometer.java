package Lab5.exercise3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {
        Thermometer t1 = new Thermometer(35);

        System.out.println("***Thermometer testing***\n " +
                "Calling the single-argument constructor...setting the temperature of the first thermometer to 35C\n " +
                "First Thermometer\n "+t1);

        Thermometer t2 = new Thermometer();

        System.out.println("***Thermometer testing***\n " +
                "Calling the single-argument constructor...setting the temperature of the second thermometer to 0C\n " +
                "Second Thermometer\n"+t2);

        t2.setTemperature(25);

        System.out.println("***Thermometer testing***\n " +
                "Calling setTemperature()...setting the temperature of the second thermometer to 25C\n " +
                "Second Thermometer\n"+t2);

        int setT1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temperature of the first thermometer: "));

        t1.setTemperature(setT1);

        System.out.println("***Thermometer testing***\n " +
                "Calling setTemperature()...setting the temperature of the first thermometer to " + setT1 +
                "C\n " +
                "First Thermometer\n"+t1);

    }
}
