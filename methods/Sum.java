package session.methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.sum();
        System.out.println("Sum= "+sum(10,30)); //Using Static Method
        System.out.println("Sum= "+sum2());
    }
    /*
        Methods have->
        AccessModifiers ReturnType Name(arguments){
        //body
        return statement;
        }
         */
    //display sum of two numbers taken from user
    void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("Sum= "+sum);
    }
    //return sum taking values by reference
    static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    //return sum taking values from user
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=a+b;
        return sum;
    }

}
