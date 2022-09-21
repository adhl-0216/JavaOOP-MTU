package Lab2;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.StringTokenizer;

public class NumbersArray {
    public static void main(String[] args) {
        double[] arr = new double[]{22.3, 45.6, 27.4, 56.6, 73.2, 11.5, 87.4, 23.8};
//        System.out.println(Arrays.toString(arr));
        double avg = 0;
        String str = "";
        System.out.println( largest(arr));
        avg = average(arr);
        str = aboveAverage(arr,avg);
    }

    private static String aboveAverage(double[] arr, double avg) {
        return "";
    }

    private static double average(double[] arr) {
        return 0;
    }

    private static double largest(double[] arr) {
        return Arrays.stream(arr).max().orElse(0);
    }

}
