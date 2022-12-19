package session.intermediate;

public class Factorial {
    public int fact(int n) {

        for(int i=n-1; i>=1; --i){
            n *= i;
        }
        return n;
    }
}
