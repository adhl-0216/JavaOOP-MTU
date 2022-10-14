package PS2.Qe;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class RockPaperScissors {
    static String[] rps = {"Rock", "Paper", "Scissors"};
    static JFrame frame = new JFrame("Rock, Paper, Scissors!");
    static JLabel label = new JLabel("Game 1 - The Computer has made its choice.");
    static JButton rock  = new JButton("Rock");
    static JButton paper  = new JButton("Paper");
    static JButton scissors  = new JButton("Scissors");
    static String player;
    static String pc;
    static int gameCount = 1;

    public RockPaperScissors(){
        //G U I
        frame.setSize(300,100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        frame.add(label);

        frame.add(rock);
        frame.add(paper);
        frame.add(scissors);

        rock.addActionListener(e -> {
            player = rps[0];
            gameOutcome(player);
        });
        paper.addActionListener(e -> {
            player = rps[1];
            gameOutcome(player);
        });
        scissors.addActionListener(e -> {
            player = rps[2];
            gameOutcome(player);
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new RockPaperScissors();
    }

    private static void gameOutcome(String player){
        frame.setVisible(false);
        pc = rps[(int) Math.floor(Math.random()*rps.length)];
        String outcome;
        if (Objects.equals(player, pc)) outcome = "Neither Player Won!";
        else if (Objects.equals(player, rps[0]) && Objects.equals(pc, rps[1])) outcome = "PC Won!";
        else if (Objects.equals(player, rps[1]) && Objects.equals(pc, rps[2])) outcome = "PC Won!";
        else if (Objects.equals(player, rps[2]) && Objects.equals(pc, rps[0])) outcome = "PC Won!";
        else outcome = "Player Won!";
        System.out.println(player+":"+pc);

        JOptionPane.showMessageDialog(null, outcome, "Game Result", JOptionPane.INFORMATION_MESSAGE);

        label.setText(String.format("Game %d - The Computer has made its choice.", ++gameCount));
        frame.setVisible(true);
    }
}
