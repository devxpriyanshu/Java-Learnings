package aptech.fjava.session5;

public class PrintMultiplesWithWhileLoop {
	public static void main(String[] args) {

		int num = 1;

		int product;
		
		while (num <= 10) {
			product = num * 14;
			System.out.printf(" 14 * %d  = %d \n", num, product);
			num++; 
		} 
		System.out.println("\n Outside the Loop");
	}
}
