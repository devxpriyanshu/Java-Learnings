package session.methods;

public class PassingValue {
    public static void main(String[] args) {

        String name = "Kunal";
        String Changed = changeName(name);
        System.out.println(Changed);
    }

    static String changeName(String name) {
        name = "Priyanshu";
        return name;
    }
}
