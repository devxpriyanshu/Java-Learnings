import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("What is your Name and Age?");
		
		String Name=scanner.nextLine();
		int Age=scanner.nextInt();
		scanner.nextLine();
		System.out.println("What's your Fav Food?");
		String Food=scanner.nextLine();
		
		System.out.println("My name is "+ Name +" & age is "+ Age +".");
		System.out.println("My favorite food is "+Food+ ".");
		
		scanner.close();

	}

}
