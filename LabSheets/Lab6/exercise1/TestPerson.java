package Lab6.exercise1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {
        Person guy = new Person();
        Person empty = new Person();
        String output = "";

        String input = JOptionPane.showInputDialog("Please enter your name: ");

        while(true){
            if (input==null || input.equals("")){
                input = JOptionPane.showInputDialog("Enter your name you monke:");
            }
            else if (!input.trim().contains(" ")){
                guy.setName(input.trim(),"");
                break;
            }
            else
            {
                String[] name = input.trim().split(" ");
                guy.setName(name[0],name[1]);
                break;
            }
        }

        output += String.format(
                """
                ***Person Class Tester***
                
                Calling the Person() constructor
                Value of the first Person object is: First name: %s  Last Name: %s
                
                Calling the Person() constructor
                Value of the second Person object is: First name: %s  Last Name: %s
                """, empty.getFirstName(),empty.getLastName(),guy.getFirstName(),guy.getLastName());

        JOptionPane.showMessageDialog(null,output,"Greetings!", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}