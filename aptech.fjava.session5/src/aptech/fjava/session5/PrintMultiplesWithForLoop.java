package aptech.fjava.session5;

public class PrintMultiplesWithForLoop {
	public static void main(String[] args) {
		int num, product;
		
		for (num = 1; num <= 7; num++) {
			product = num * 10;

			System.out.printf("\n % d * 10 = % d ", num, product);
		} 
	}
}
