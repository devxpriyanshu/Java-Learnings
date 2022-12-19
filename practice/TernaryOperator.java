package session.practice;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int max = (a>b)? (a>c)? a:c :b;

        System.out.println(max);
    }
}