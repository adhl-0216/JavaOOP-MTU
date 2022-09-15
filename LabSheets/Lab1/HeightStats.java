package Lab1;

import java.util.*;

public class HeightStats {
    public static void main(String[] args) {
        try {
            int iter = 0;
            final int loop = 6;
            double[] hArr = new double[6];
            final double maxH = 2.72;
            final double minH = 0.5464;
            final double glbAvg = 1.665;
            do {
                Scanner line = new Scanner(System.in);
                double h;

                System.out.printf("Loop %d - Please enter height: ",iter + 1);
                h = line.nextDouble();

                while (h > maxH || h < minH) {
                    System.out.printf("Loop %d - Height value invalid !!! Please enter height: ",iter + 1);
                    h = line.nextDouble();
                }
                hArr[iter] = h;
                iter++;
                System.out.println("\n");

            } while (iter < loop);

            double avgH = Arrays.stream(hArr).average().orElse(Double.NaN);
            double minVal = Arrays.stream(hArr).min().orElse(Double.NaN);
            int inRangeOf = 0;
            for (double n: hArr) {
                if(n <= 1.9 && n>= 1.3)inRangeOf++;
            }

            double nAbvGlbAvg = 0;
            for (double n: hArr) {
                if(n >glbAvg){nAbvGlbAvg++;}
            }
            double pctAbvGlbAvg = nAbvGlbAvg/hArr.length*100;

            System.out.println("---Height Statistics---");
            System.out.printf("The average of the heights entered is %.1fm %n", avgH);
            System.out.printf("The smallest height value entered is %.2fm %n", minVal);
            System.out.printf("The number of height values that were between 1.3m and 1.9m inclusive is %d%n", inRangeOf);
            System.out.printf("The percentage of height values that exceeded the global average height is %.2f%%%n ", pctAbvGlbAvg);
        }
        catch (Exception e){
            throw new RuntimeException("Please enter relevant information.");
        }
    }
}
