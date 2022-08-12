import java.util.Scanner;
public class ProjectHypotenuse {

	public static void main(String[] args) {
		
		double a,b,c;
		
		Scanner scanner= new Scanner(System.in);
		
        System.out.println("Enter First Side: ");
		a = scanner.nextDouble();
		System.out.println("Enter Second Side: ");
        b = scanner.nextDouble();
		
		
		c = (a*a)+(b*b);
		
		c = Math.sqrt(c);
		
		System.out.println("The Hypotenus is "+ c);
		
		scanner.close();

	}

}
