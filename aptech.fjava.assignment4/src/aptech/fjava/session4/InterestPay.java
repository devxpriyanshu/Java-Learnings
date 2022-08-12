package aptech.fjava.session4;

import java.util.Scanner;

public class InterestPay {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		double interest, deposit;
		
		System.out.print("Enter the deposit amount ");
        deposit = scanner.nextDouble();
		
		if(deposit>=7000) {
			interest =deposit*5/100;
			System.out.println("The amount of interest earned on your deposit is "+ interest);
		}
		else if(deposit>2000 && deposit <7000) {
			interest =deposit*4.5/100;
			System.out.println("The amount of interest earned on your deposit is "+ interest);
		}
		else if(deposit<=2000) {
			interest =deposit*4/100;
			System.out.println("The amount of interest earned on your deposit is "+ interest);
		}
		scanner.close();
	}

}
