package Lab1;

import java.util.Scanner;

public class HeightStats {
    public static void main(String[] args) {
        try {
            Scanner line = new Scanner(System.in);
            double h;
            int iter = 0;
            final int loop = 6;
            final double maxH = 2.72;
            final double minH = 0.5464;


            System.out.printf("Loop %d - Please enter height: %n", iter+1);

            h = line.nextDouble();
            boolean neg = h < 0;
            switch (h){
                case > maxH:
            }
        }
        catch (Exception e){
            throw new RuntimeException("Please enter relevant information.");
        }
    }
}
