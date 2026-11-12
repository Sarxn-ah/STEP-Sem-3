package week11assignment;

import java.util.Arrays;

public class DiceThrowTally {

    public static int[] diceSort(int[] rolls) {
        int[] count = new int[7];
        for (int roll : rolls) {
            count[roll]++;
        }
        StringBuilder counts = new StringBuilder("Counts:");
        for (int value = 1; value <= 6; value++) {
            counts.append(" ").append(value).append(":").append(count[value]);
        }
        System.out.println(counts);

        int[] sorted = new int[rolls.length];
        int index = 0;
        for (int value = 1; value <= 6; value++) {
            for (int times = 0; times < count[value]; times++) {
                sorted[index++] = value;
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] sorted = diceSort(new int[]{4, 1, 6, 4, 2, 1, 4});
        System.out.println("Sorted: " + Arrays.toString(sorted));

        System.out.println();
        int[] custom = diceSort(new int[]{2, 2, 5, 6, 6, 6});
        System.out.println("Sorted: " + Arrays.toString(custom));
    }
}
