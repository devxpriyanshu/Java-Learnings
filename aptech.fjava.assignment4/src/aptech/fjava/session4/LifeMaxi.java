package aptech.fjava.session4;

import java.util.Scanner;

public class LifeMaxi {

	public static void main(String[] args) {
		// Whether the customer is eligible for the Loan
		Scanner scanner = new Scanner(System.in);
		int age, personalAssets, gender, profession,loanAmount;
		
		System.out.println("What is your age?");
		age = scanner.nextInt();
		
		System.out.println("What is your gender? \n>>Type 1 or 2 for Male or Female Respectively.");
		gender = scanner.nextInt();
		
		System.out.println("How much value of personal asset do you own?");
		personalAssets = scanner.nextInt();	
		
		System.out.println("Are you Self-Employed, Professional or Retired? \n>>Type 1,2 or 3 respectively for each");
		profession = scanner.nextInt();
		
		if(age>60) {
			if (personalAssets>25000) {
				if(profession==1) {
					loanAmount=35000-(age*100);
					System.out.println("Congratulation!! You are eligible loan of "+loanAmount+".");
				}
				else if(profession==3) {
					loanAmount=25000-(age*100);
					System.out.println("Congratulation!! You are eligible loan of "+loanAmount+".");
				}
			}
		}
		else if(age>41 && age<60) {
			if (personalAssets>50000) {
					loanAmount=40000;
					System.out.println("Congratulation!! You are eligible loan of "+loanAmount+".");
			}
		}
		else if(age>26 && age<40) {
			if (personalAssets>40000) {
				if(gender==1) {
					loanAmount=25000;
					System.out.println("Congratulation!! You are eligible loan of "+loanAmount+".");
				}
				else if(gender==2) {
					loanAmount=30000;
					System.out.println("Congratulation!! You are eligible loan of "+loanAmount+".");
				}
			}
		}
		else if(age>16 && age<25) {
			if (personalAssets>25000) {
				if(profession==1) {
					loanAmount=10000;
					System.out.println("Congratulation!! You are eligible loan of "+loanAmount);
				}
				else if(profession==2) {
					loanAmount=15000;
					System.out.println("Congratulation!! You are eligible loan of "+loanAmount);
				}
			}
		}
		else {
			System.out.println("Sorry!! You are not eligible for the loan or Given us wrong Input");
		}
		
        scanner.close();
	}

}
