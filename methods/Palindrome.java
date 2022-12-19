package session.methods;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(12321));
    }
    static boolean isPalindrome(int n){
        int rev=0,digit,x=n;

        while(x>0){
            digit = x%10;
            rev = rev*10 + digit;
            x/=10;
        }
        return rev == n;
    }
}
