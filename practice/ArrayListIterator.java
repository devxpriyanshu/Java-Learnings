package session.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIterator {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            ArrayList<Integer> arrList = new ArrayList<Integer>(5);

            System.out.println("Enter the Elements: ");
            for (int i = 0; i < 5; i++) {
                int val = sc.nextInt();
                arrList.add(val);
            }

            Integer[] arr = new Integer[arrList.size()];
            arrList.toArray(arr);

            System.out.print("Elements in List : ");

            for (int j: arr) {
                System.out.print(j + " ");
            }

            int sum = sumOfArray(arr, arr.length - 1);

            System.out.println();

            System.out.println("Sum of elements : " + sum);
        }
        public static int sumOfArray(Integer[] a, int n)
        {
            if (n == 0)
                return a[n];
            else
                return a[n] + sumOfArray(a, n - 1);
        }
    }

