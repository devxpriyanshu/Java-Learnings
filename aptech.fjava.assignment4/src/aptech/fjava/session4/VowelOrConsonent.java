package aptech.fjava.session4;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Write any letter!");
		char character = scanner.next().charAt(0);
		
		char ch = Character.toLowerCase(character);
		
		switch(ch) {
		
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' : System.out.println(character +" is vowel.");
		break;
		
		default: System.out.println(character+" is consonent.");
			
		}
		
		scanner.close();
	}

}
