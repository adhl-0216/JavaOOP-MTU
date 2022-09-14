package Lab1;

import java.util.Scanner;

public class NumbersMenu {
    public static void main(String[] args) {
        try {
            int iter = 0;
            Scanner line = new Scanner(System.in);
            System.out.printf("---Iteration %d---%n",(iter+1) );
            System.out.println("Please enter any whole number: ");

            int wNum;
            wNum = line.nextInt();
            System.out.println(wNum);
        } catch (Exception e) {
            throw new RuntimeException("Please insert relevant information.");
        }
    }
}
