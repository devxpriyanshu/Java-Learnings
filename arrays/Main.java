package session.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        for (int j : arr) {                         //for each
            System.out.print(j+" ");
        }


        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
