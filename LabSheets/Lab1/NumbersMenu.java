package Lab1;

import java.util.Scanner;

public class NumbersMenu {
    public static void main(String[] args) {
        try {
            int iter = 0;
            final int loops = 10;
            do {
                Scanner line = new Scanner(System.in);
                System.out.printf("%n---Iteration %d---%n",(iter+1) );
                System.out.println("Please enter any whole number: ");

                int wNum;
                wNum = line.nextInt();
                iter++;
                System.out.println("What would you like to do?\n" +
                        "1. Determine if the number is odd or even\n" +
                        "2. Find the factorial of the number\n" +
                        "3. Quit the program");
                int response;
                response = line.nextInt();

                switch (response){
                    case 1:
                        oddEven(wNum);
                        continue;
                    case 2:
                        System.out.println("The factorial of the number you entered is "+ factorial(wNum));
                        continue;
                    case 3:
                        System.out.println("Quitting the program earlier than anticipated... goodbye");
                        iter = 10;
                        continue;
                }
//                iter++;
            } while (loops > iter);

        } catch (Exception e) {
            throw new RuntimeException("Please insert relevant information.");
        }
    }

    public static void oddEven(int num){
        if (num%2 == 1) {
            System.out.println("The number you entered is odd.");
        }else {
            System.out.println("The number you entered is even.");
        }
    }

    public static int factorial(int n) {
        if (n>=0) {
            if (n == 0){
                return 1;
            }
            else {
                return factorial(n - 1)*n;
            }
        } else {
            System.out.println("Cannot get the factorial of a negative number!");
            return n;
        }
    }
}
