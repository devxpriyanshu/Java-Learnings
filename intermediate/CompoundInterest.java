package session.intermediate;

public class CompoundInterest {
    public static void main(String[] args) {

        double P = 100, r = 10, t = 10;
        double A,p;
        p = (Math.pow((1 + r / 100), t));
        A = (P * p);

        System.out.println(A);
    }
}
