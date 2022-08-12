package aptech.fjava.session5;

public class SumOfNumbers {
	public static void main(String[] args) {
		int num = 1, sum = 0;
		
		do {
			sum = sum + num;
			num++;
		} while (num <= 100);
		
		System.out.printf("Sum of 10 Numbers: %d\n", sum);
	}
}
