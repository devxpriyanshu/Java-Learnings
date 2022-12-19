package session.methods;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
//        prime(139);
        armstrong(154);
    }

    static void prime(int num) {
        if(num==1 || num==0) {
            System.out.println("Number is neither prime nor composite.");
        }
        else {
            int flag = 1;
            for (int i = 2; i * i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not prime");
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(num + " is prime.");
            }
        }
    }

    static void armstrong(int n){
        int x =n,sum=0;
        int digit=0;
        while(x>0){
            x/=10;
            digit++;
        }
        x=n;
        while(x>0){
            sum = (int) (sum + Math.pow(x%10,digit));
            x/=10;
        }
        System.out.print(sum);
        if(n==sum){
            System.out.println(" is Armstrong Number");
        }
    }
}
