package session.intermediate;

public class Lcm {
    public static void main(String[] args) {

        int num1 = 12,num2= 9,gcd=1,lcm;

        //to find gcd
        for(int i=1; i<=num1 && i<=num2; i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        lcm=(num1*num2)/gcd;
        System.out.println(lcm);
    }
}
