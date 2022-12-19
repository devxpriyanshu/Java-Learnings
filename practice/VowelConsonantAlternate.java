package session.practice;

public class VowelConsonantAlternate {
    public static void main(String[] args) {

        String str="HelloBaby";
        StringBuilder res= new StringBuilder();
        int j=1;
        char ch = str.charAt(0);
        if(isVowel(ch)){
            j=0;
        }
        str = str.toLowerCase();

        for(int i=0; i<str.length();i++){
            ch = str.charAt(i);
            while (isVowel(ch) && j==0){
                res.append('V');
                j=1;
            }
            if(!isVowel(ch) && j==1){
                res.append('C');
                j=0;
            }
        }
        System.out.println(res);
    }
    static boolean isVowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
}
