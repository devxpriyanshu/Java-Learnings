package aptech.fjava.session5;

public class NumberRoot {
	public static void main(String[] args) {
		int cnt, square, cube;
		
		for (cnt = 1; cnt < 30; cnt++) {
			if (cnt % 2 != 0) {
				continue;
			}
			square = cnt * cnt;
			cube = cnt * cnt * cnt;
			System.out.printf("\nSquare of %d is %d and Cube is %d.", cnt, square, cube);
		} 
	}
}
