package session.basic;

import java.util.Scanner;

public class SumTillUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,sum=0;
        num = sc.nextInt();
        while(num!=0){
            sum+=num;
            num = sc.nextInt();
        }
        System.out.println(sum);
    }
}
