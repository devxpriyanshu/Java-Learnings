import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int rows, colunms;
		String symbol="";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter # of colunms: ");
		colunms = scanner.nextInt();
		
		System.out.println("Enter symbol to use: ");
		symbol= scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println("");
			for(int j=colunms; j>=i; j--) {
				System.out.print(symbol);
			}
		}
	scanner.close();	
	}

}
