package session.methods;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int num){

        int fact=1;

        while(num!=1){
            fact=fact*num;
            num--;
        }
        return fact;
    }

}
