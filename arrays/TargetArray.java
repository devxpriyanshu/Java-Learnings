package session.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        int[] result = new int[nums.length];
        for (int num : nums) {
            target.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            target.add(nums[i],index[i]);
        }
        System.out.println(target);
        return result;
    }
}
