package Lab2;

import javax.swing.*;

public class RollTheDice {
    public static void main(String[] args) {
        String response = JOptionPane.showInputDialog("Would you like to play a game of dice? (Y or N)");

        switch (response){
            case "N" -> JOptionPane.showMessageDialog(null, "Thanks for playing the game!","Farewell",JOptionPane.INFORMATION_MESSAGE);
            case "Y" -> System.out.println("yay");
        }

        System.exit(0);

    }
}
