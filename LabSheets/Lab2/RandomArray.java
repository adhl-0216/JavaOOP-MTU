package Lab2;

import javax.swing.*;
import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        populateArray(arr);
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        double pctAbv100 = 0;
        for (int i = 0; i<sortedArr.length;i++) {
            if ((sortedArr[i] > 100)) {
                pctAbv100 = (Arrays.copyOfRange(sortedArr, i, sortedArr.length)).length*10;
                break;
            }
        }
        String output = String.format("""
                The initial contents of the array is %s
                The percentage of values that exceed 100 is %.2f%%
                The contents of the array after sorting is: %s
                """, Arrays.toString(arr), pctAbv100, Arrays.toString(sortedArr));
        JOptionPane.showMessageDialog(null,output);
    }

    private static void populateArray(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (1 + (Math.random())*1000);
        }
    }
}
