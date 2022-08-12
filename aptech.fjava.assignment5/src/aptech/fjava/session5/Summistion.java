package aptech.fjava.session5;

import java.util.Scanner;

public class Summistion {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		int num, sum=0;
		
		System.out.println("Enter the number: ");
		num = scanner.nextInt();
		
		while(num != 0) {
			sum = sum + num%10;
			
			num = num / 10;
		}
		
System.out.println("Sum of all the digits = "+sum);

scanner.close();
	}

}
