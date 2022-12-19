package session.basic;

public class ReverseNum {
    public static void main(String[] args) {
        int num =12345, digit, revNum=0;

        while(num!=0){
            digit = num%10;
            revNum = revNum*10 + digit;
            num/=10;
        }
        System.out.println(revNum);
    }
}
