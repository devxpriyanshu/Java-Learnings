package session.basic;

import java.util.Scanner;

public class CheckCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch<='z'){
            System.out.println(ch + " is lowercase");
        }
        else if(ch >='A' && ch<= 'Z'){
            System.out.println(ch+ " is uppercase");
        }
        else{
            System.out.println("Invalid Character input");
        }
    }
}
