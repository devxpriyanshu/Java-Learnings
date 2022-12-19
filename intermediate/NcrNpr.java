package session.intermediate;

public class NcrNpr {
    /*
    nCr = n!/(r!*(n-r)!)
    nPr = n!/(n-r)!
     */

    public static void main(String[] args) {
        Factorial obj = new Factorial();

        int n=5,r=2;

        double nCr = obj.fact(5)/(obj.fact(r)*obj.fact(n-r));
        double nPr = obj.fact(5)/(obj.fact(n-r));

        System.out.println("nCr= "+nCr+"\nnPr= "+nPr);
    }

}
