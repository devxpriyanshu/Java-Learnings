package session.basic;

public class ProductSumofDigits {
        public int subtractProductAndSum(int n) {

            int sum=0,product=1,results;

            while(n>0){
                sum+=n%10;
                product*=n%10;
                n/=10;
            }
            results = product - sum;
            System.out.println(results);
            return results;
        }
}
