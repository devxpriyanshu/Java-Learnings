package aptech.fjava.session4;

import java.util.Scanner;

public class TestNumericOperation {
	
	public static void main(String[] args) {

		int choice = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Choice for operation: ");
		System.out.println("1 for Addition");
		System.out.println("2 for Subtraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division");

		choice = scan.nextInt();

	
		switch (choice) {
		case 1:
			System.out.println("Addition");
			break;
		case 2:
			System.out.println("Subtraction");
			break;
		case 3:
			System.out.println("Multiplication");
			break;
		case 4:
			System.out.println("Division");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		
		scan.close();
	}
}
