package session.methods;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println(greet("Priyanshu"));
        System.out.println(greet());
    }

    //Giving Parameters
    static String greet(String name) {
        return "Hello "+name;
    }
    //User input
    static String greet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your nick name: ");
        String greet = sc.next();
        return "Welcome "+greet;
    }
}
