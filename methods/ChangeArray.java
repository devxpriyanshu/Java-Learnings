package session.methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeArray {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        System.out.println(Arrays.toString(nums));
        ChangeValue(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void ChangeValue(int[] arr) {
        arr[0] = 99;
    }
}
