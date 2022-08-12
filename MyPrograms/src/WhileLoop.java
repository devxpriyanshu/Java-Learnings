import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		String name="";		
		
		//While loop can continue to run infinitely unlike For loop. 
		
		while(name.isBlank()) {
			System.out.println("What is your name?");
			name= scanner.nextLine();
		}
		
	System.out.println("\nYour name is: "+ name);
	
	scanner.close();

	}

}
