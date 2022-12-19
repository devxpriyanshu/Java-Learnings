package session.basic;

import java.util.Scanner;

public class NumberOcurence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
        int digit = sc.nextInt();

        int d,count=0;
        while(num!=0){
            d = num%10;
            num /= 10;
            if(d==digit){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
