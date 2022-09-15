package Lab1;

import java.util.Scanner;

public class HeightStats {
    public static void main(String[] args) {
        try {
            int iter = 0;
            final int loop = 6;
            do {
                Scanner line = new Scanner(System.in);
                double h;
                double[] hArr = new double[6];
                final double maxH = 2.72;
                final double minH = 0.5464;

                System.out.printf("Loop %d - Please enter height: %n", iter+1);
                h = line.nextDouble();

                while(h > maxH || h< minH){
                    System.out.printf("Loop %d - Height value invalid !!! Please enter height: %n", iter+1);
                    h = line.nextDouble();
                }
                hArr[iter] = h;
                iter++;

            } while (iter < loop);
        }
        catch (Exception e){
            throw new RuntimeException("Please enter relevant information.");
        }
    }
}
