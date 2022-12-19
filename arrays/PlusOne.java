package session.arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}
