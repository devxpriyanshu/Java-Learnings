package session.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseTillNegative {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        ArrayList arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int pos;
        do{
            pos = in.nextInt();
            if(pos>=0)
            arr.add(pos);
        }
        while(pos>=0);
        int n = arr.size();
        for(int i=n-1;i>=0;--i){
            System.out.print(arr.get(i)+" ");
        }

    }
}
