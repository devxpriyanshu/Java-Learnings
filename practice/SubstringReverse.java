package session.practice;

import java.util.Scanner;

public class SubstringReverse {
    public static void main(String[] args) {
        //Don't alter anything here.
        Scanner inp = new Scanner(System.in);
        String S = inp.nextLine();
        int L = inp.nextInt();
        inp.nextLine();
        int R = inp.nextInt();
        inp.nextLine();
        inp.close();

        System.out.println(solve(S,L,R));
        /**************************************/
    }

    //complete the function below

    public static String solve(String s, int L, int R)
    {
        StringBuffer Str2 = new StringBuffer(s.substring(L,R+1));
        StringBuffer Str3 = new StringBuffer(s.substring(L,R+1));

        Str3.reverse();
        String K = s.replace(Str2,Str3);
        return K;
    }
}