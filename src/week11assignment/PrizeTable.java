package week11assignment;

import java.util.Arrays;

public class PrizeTable {

    public static int prizeTable(int[] marks) {
        int swaps = 0;
        int n = marks.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (marks[j] > marks[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = marks[i];
                marks[i] = marks[maxIndex];
                marks[maxIndex] = temp;
                swaps++;
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        int[] first = {45, 90, 60, 75};
        int firstSwaps = prizeTable(first);
        System.out.println(Arrays.toString(first) + "    swaps = " + firstSwaps);

        int[] second = {80, 70, 60};
        int secondSwaps = prizeTable(second);
        System.out.println(Arrays.toString(second) + "    swaps = " + secondSwaps);

        System.out.println();
        int[] custom = {55, 20, 90, 40, 70};
        int customSwaps = prizeTable(custom);
        System.out.println(Arrays.toString(custom) + "    swaps = " + customSwaps);
    }
}
