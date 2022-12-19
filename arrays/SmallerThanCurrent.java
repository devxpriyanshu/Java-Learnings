package session.arrays;

import java.util.Arrays;

public class SmallerThanCurrent {
    public static void main(String[] args) {
        int nums[] = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = new int[nums.length], count = new int[nums.length];
        System.arraycopy(nums, 0, sorted, 0, nums.length);
        Arrays.sort(sorted);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < sorted.length; j++) {
                if (nums[i] == sorted[j]) {
                    count[i] = j;
                    break;
                }
            }
        }

        return count;
    }
}
