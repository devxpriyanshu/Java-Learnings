package session.basic;

import java.util.Scanner;

public class LargestInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , max , min ;
        num = sc.nextInt();
        max = num ;
        min = num;
        while (num != 111) {
            num = sc.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Largest Number: " + max);
        System.out.println("Smallest Number: " + min);

    }
}
