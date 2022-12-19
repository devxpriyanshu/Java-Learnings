package session.methods;

public class Shadowing {
    static int x=2345;//this will be SHADOWED at line 9          //object dependent so declared static

    public static void main(String[] args) {    //object independent
        System.out.println(x); //2345
        int x =110;
        System.out.println(x); //110
        fun();
    }
    static void fun(){                          //object dependent so declared static
        System.out.println(x);
    }
}
