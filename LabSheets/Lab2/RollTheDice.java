package Lab2;

import javax.swing.*;

public class RollTheDice {
    public static void main(String[] args) {
        String response = JOptionPane.showInputDialog("Would you like to play a game of dice? (Y or N)");

        switch (response){
            case "N" -> JOptionPane.showMessageDialog(null, "Thanks for playing the game!","Farewell",JOptionPane.INFORMATION_MESSAGE);
            case "Y" -> rollLeDice();
        }

        System.exit(0);

    }

    private static void rollLeDice() {
        int dice1 = (int) (1 + (Math.random()*6));
        int dice2 = (int) (1 + (Math.random()*6));
        int compRoll = dice1 + dice2;
        System.out.println(dice1 +" "+ dice2);
        JOptionPane.showMessageDialog(null, "The Computer rolled: " + compRoll );
    }
}
