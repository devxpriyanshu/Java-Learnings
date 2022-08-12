package aptech.fjava.session3;

import java.util.Scanner;

public class FormattedInput {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number , float, & string: ");
		
		int num = s.nextInt();	
		float decimal= s.nextFloat();
		String str = s.next();
		
		System.out.println("Values:" + num + decimal + str);
		System.out.format("Values: %d, %3.2f & %s.", num, decimal, str);
		
		s.close();

	}

}
