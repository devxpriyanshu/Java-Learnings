package session.methods;

public class TestMain {
    public static void main(String[] args) {
        int a =90; //initialising -> outside block can be used inside the block
        {
            a = 100; //updating
            int c= 19; //inside block -> cant be used outside
        }
        int c = 900;
        System.out.println(a);
        System.out.println(c);
    }
}
