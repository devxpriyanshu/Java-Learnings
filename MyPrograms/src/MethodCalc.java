import java.util.*;

public class MethodCalc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int x = scanner.nextInt();
		System.out.print("Enter second number :");
		int y = scanner.nextInt();
		
		System.out.println("Choose process: +,-,*,/");
		char z = scanner.next().charAt(0);
		
		switch(z) {
		case '+': System.out.println("result "+add(x,y));
		break;
		case '-': System.out.println("result "+sub(x,y));
		break;
		case '*': System.out.println("result "+multi(x,y));
		break;
		case '/': System.out.println("result "+div(x,y));
		break;
		}
		
		scanner.close();
	}
	
	static int add(int x, int y) {
		return x+y;
	}
	static int sub(int x, int y) {
		return x-y;
	}
	static int multi(int x, int y) {
		return x*y;
	}
	static int div(int x, int y) {
		return x/y;
	}
}
