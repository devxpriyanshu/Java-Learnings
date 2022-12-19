package session.arrays;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 0, 2};

        System.out.println(Arrays.toString(arr) + " \nSize: " + arr.length);

        System.out.println("Max element: " + max(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
