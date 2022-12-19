package session.methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(10,20,30,40,50,40);
        multiple(10,20,"Priyanshu","Rakesh","Rahul");
    }
    static void fun(int ...va){
        // Variable Arguments -> Takes array of values
        System.out.println(Arrays.toString(va));
    }
    static void multiple(int a, int b, String ...va){
        //Multiple Type Arguments
        System.out.println(a+" " +b+Arrays.toString(va));
    }
}
