package aptech.fjava.session5;

import java.util.Scanner;

public class CalculatorMenu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		double num1, num2, result;
		char ch;
		
		System.out.println("Type y to use Calculator! or n to Exit.");
		ch= scanner.next().charAt(0);
		
		while(ch == 'y') {
		System.out.print("Enter the first number: ");
		num1 = scanner.nextDouble();
		
		System.out.print("Enter the second number: ");
		num2 = scanner.nextDouble();
		
		System.out.println("Press the following numbers(1,2,3 or 4):\n1.Addition \n2.Substraction \n3.Multiplication \n4.Division");
		choice = scanner.nextInt();
		
		switch(choice) {
		case 1: 
			result= num1 + num2;
			System.out.println("Addition of "+num1+" & "+num2+" is "+ result+".");
			break;
		case 2: 
			result= num1 - num2;
			System.out.println("Substraction of "+num1+" & "+num2+" is "+ result+".");
			break;
		case 3: 
			result= num1 * num2;
			System.out.println("Multiplication of "+num1+" & "+num2+" is "+ result+".");
			break;
		case 4: 
			result= num1 / num2;
			System.out.println("Division of "+num1+" & "+num2+" is "+ result+".");
			break;
		default:
			System.out.println("You have entered wrong input.");
		}
		System.out.println("Type y to use Calculator again! or n to Exit.");
		ch= scanner.next().charAt(0);
		}
		System.out.println("You have Exited!");
		scanner.close();
        
       
	}

}
