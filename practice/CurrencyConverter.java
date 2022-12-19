package session.practice;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indian: INR \nUnited States: USD \nPakistan: PAK \nEurope: EURO \nJAPAN: YEN \n");

        System.out.println("Which currency you want to convert? (enter currency short form)");
        String cur1 = sc.next();

        System.out.println("In Which currency you want to convert? (enter currency short form)");
        String cur2 = sc.next();

        System.out.println("Enter the value you want to convert: ");
        double input = sc.nextDouble();

        double ans = inputCurrency(input, cur1, cur2);

        System.out.println("The Converted currency: "+ ans);
    }

    static double inputCurrency(double input, String cur1, String cur2){

        switch (cur1) {

            case "INR":
            case "YEN":
                switch (cur2) {
                    case "INR":
                        return 1 * input;
                    case "PAK":
                        return 2.68 * input;
                    case "USD":
                    case "EURO":
                        return 0.012 * input;
                    case "YEN":
                        return 1.78 * input;
                    default:
                        throw new IllegalArgumentException();
                }
            case "PAK":
                switch (cur2) {
                    case "INR":
                        return 0.37 * input;
                    case "PAK":
                        return 1 * input;
                    case "USD":
                    case "EURO":
                        return 0.0045 * input;
                    case "YEN":
                        return 0.66 * input;
                    default:
                        throw new IllegalArgumentException();
                }

            case "USD", "EURO":
                switch (cur2) {
                    case "INR":
                        return 0.56 * input;
                    case "PAK":
                        return 1.50 * input;
                    case "USD":
                    case "EURO":
                        return 0.0068 * input;
                    case "YEN":
                        return 1 * input;
                    default:
                        throw new IllegalArgumentException();
                }
        }

        return -1;

        }
}
