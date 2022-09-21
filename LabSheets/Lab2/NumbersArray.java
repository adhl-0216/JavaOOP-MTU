package Lab2;

import javax.swing.*;
import java.util.Arrays;

public class NumbersArray {
    public static void main(String[] args) {
        double[] arr = new double[]{22.3, 45.6, 27.4, 56.6, 73.2, 11.5, 87.4, 23.8};
        double avg;
        String abvAvg;

        avg = average(arr);
        abvAvg = aboveAverage(arr,avg);
        String str = null;
        if (abvAvg != null) str = abvAvg.substring(1,abvAvg.lastIndexOf(']'));

        String output = String.format("""
                The largest value in the array is %.1f \t
                The average value in the array is %.3f \t
                The list of values above the average is: \n%s
                """,largest(arr),avg,str);
        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    }

    private static String aboveAverage(double[] arr, double avg) {
        arr = Arrays.stream(arr).sorted().toArray();
        for (int i = 0; i<arr.length;i++) {
            if ((arr[i] > avg)) {
                return Arrays.toString(Arrays.copyOfRange(arr, i, arr.length));
            }
        }
        return null;
    }

    private static double average(double[] arr) {
        return Arrays.stream(arr).summaryStatistics().getAverage();
    }

    private static double largest(double[] arr) {
        return Arrays.stream(arr).max().orElse(0);
    }

}
