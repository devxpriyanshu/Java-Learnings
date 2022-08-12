package aptech.fjava.session5;

import java.util.Scanner;

public class PrimeNumbersInbetween {

	public static void main(String[] args) {
		  Scanner my_scanner = new Scanner(System.in);
		
	      int high, low, i;
	      boolean temp;
	      
	     
	      System.out.print("Enter the starting number : ");
	      low = my_scanner.nextInt();
	      
	      System.out.print("Enter an ending Number: ");
	      high = my_scanner.nextInt();
	      
	      System.out.println("The prime numbers between the interval " + low + " and " + high + " are:");
	     
	      while (low < high) {
	         temp = false; //is a prime number
	         for(i = 2; i <= low/2; ++i) { //not a prime number
	            if(low % i == 0) {
	               temp = true;
	               break;
	            }
	         }
	         
	         if (!temp && low != 0 && low != 1)
	            System.out.print(low + " ");
	         ++low;
	      }
	   }

}
