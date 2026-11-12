package week11practice;

public class PairSumSortedArray {

    public static int[] pairSumSorted(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{nums[left], nums[right]};
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] first = pairSumSorted(new int[]{-4, -1, 0, 3, 5, 9}, 4);
        System.out.println(first == null ? "Not Found" : "(" + first[0] + ", " + first[1] + ")");
        int[] second = pairSumSorted(new int[]{1, 2, 3}, 100);
        System.out.println(second == null ? "Not Found" : "(" + second[0] + ", " + second[1] + ")");
    }
}
