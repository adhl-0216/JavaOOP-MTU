package Lab5.exercise4;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
        String output = "";

        BankAccount ba1 = new BankAccount();

        output += "Calling the no-argument BankAccount constructor. The first BankAccount object details are:\n\n" + ba1;

        BankAccount ba2 = new BankAccount("Richy Rich", 2342343, 0.75);

        output +="\n\nCalling the multi-argument BankAccount constructor. The second BankAccount object details are:\n\n" + ba2;

        double chgRate = Double.parseDouble(JOptionPane.showInputDialog("Insert new interest rate: "));

        BankAccount.setInterestRate(0.5);

        output += String.format(
                """
               
                ======================================================================================
               
                Now calling the setInterestRate() method to change the interest rate to %.2f
                
                The first BankAccount details are:
                
                %s
                
                The second BankAccount object details are:
                
                %s
                """ ,
                chgRate, ba1, ba2
        );

        JOptionPane.showMessageDialog(null, output, "BankAccount Object Data", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}