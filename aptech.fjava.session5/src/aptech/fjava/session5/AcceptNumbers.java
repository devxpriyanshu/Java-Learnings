package aptech.fjava.session5;

import java.util.Scanner;

public class AcceptNumbers {
	public static void main(String[] args) {
		int cnt, number; 
		
		for (cnt = 1, number = 0; ; cnt++) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number: ");
			number = input.nextInt();
			if (number == 0) {
				
				System.out.println("you have entered 0, so stoping here");
				System.out.println(cnt);
				break;
					
			} 
			input.close();
			
		} 
		
	}
}
