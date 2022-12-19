package session.basic;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        //Q: Find the largest of the three numbers

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is largest.");
            }
        } else if (b > c) {
            System.out.println(b + " is largest.");
        } else {
            System.out.println(c + " is largest.");
        }

        // Using Math Function
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}

