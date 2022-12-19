package session.intermediate;

public class ReverseStr {
    public static void main(String[] args) {
        String str="Hello",rev="";

        for(int i =str.length()-1; i>=0;--i){
            rev+=str.charAt(i);
        }
        System.out.println(rev);

        //Using String Builder Class
        StringBuilder rev1 = new StringBuilder(str);
        rev1.reverse();
        System.out.println(rev1);
    }
}
