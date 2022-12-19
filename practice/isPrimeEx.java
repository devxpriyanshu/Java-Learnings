package session.practice;

import java.lang.*;
import java.util.*;
import java.math.BigInteger;

public class isPrimeEx {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner in =new Scanner(System.in);

        String n = in.nextLine();

        BigInteger a = new BigInteger(n);

        prime(a);
    }

    static void prime(BigInteger num) {
        if(num.equals(1) || num.equals(0)) {
            System.out.println("Number is neither prime nor composite.");
        }
        else {
            int flag = 1;
            for (int i = 2; i * i <= num.intValue() ; i++) {
                if (num.intValue() % i == 0) {
                    System.out.println("not prime");
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("prime");
            }
        }
    }
}