package Lab2;

import javax.swing.*;
import java.util.Objects;

public class RollTheDice {
    static int compWs = 0 ;
    static int playerWs = 0;
    static int draws = 0;
    static int gamesPlayed = 0;
    public static void main(String[] args) {

        do {
            String response = JOptionPane.showInputDialog("Would you like to play a game of dice? (Y or N)");

            if (Objects.equals(response.toUpperCase() , "N")){
                JOptionPane.showMessageDialog(null, "Thanks for playing the game!","Farewell",JOptionPane.INFORMATION_MESSAGE);
                break;
            } else if (Objects.equals(response.toUpperCase(), "Y")) {
                rollLeDice();
                gamesPlayed++;
                JOptionPane.showMessageDialog(null,
                        "Games played: " + gamesPlayed +
                                "\nComputer Wins: " + compWs +
                                "\nPlayer wins: " + playerWs +
                                "\nDraws: "+ draws);

            }
        }
        while (true);

        System.exit(0);
    }

    public static void rollLeDice() {
        int compRoll = 0;
        int playerRoll = 0;

        for (int i = 0; i < 2; i++) {
            int dice1 = (int) (1 + (Math.random() * 6));
            int dice2 = (int) (1 + (Math.random() * 6));
            if (i == 0) {
                compRoll = dice1 + dice2;
                JOptionPane.showMessageDialog(null, "The Computer rolled a " + compRoll + " !" +
                        "\nPress enter to roll your dice!");
            } else {
                playerRoll = dice1 + dice2;
                JOptionPane.showMessageDialog(null, "You rolled a " + playerRoll + " !");
            }
        }
        if (compRoll == playerRoll) draws++;
        else if(compRoll < playerRoll) playerWs++;
        else compWs++;
    }
}

