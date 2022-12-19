package session.arrays;

import java.util.Arrays;

public class Reversing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int[] arr) {

        int start = 0, end = arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }
}
