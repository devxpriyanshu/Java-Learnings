package session.intermediate;

public class Vowel {
    public static void main(String[] args) {
        String str="Hello There!!";
        char ch;
        int count=0;
        for(int i = 0; i<=str.length()-1; i++){
            str.toLowerCase();
            ch=str.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u' ){
               count++;
            }
        }
        System.out.println("String contains "+count+" vowels.");
    }
}
