package aptech.fjava.session5;

public class TestLabeledBreak {
	public static void main(String[] args) {
		int i;
		outer: for (i = 0; i <5; i++) {
			if (i == 3) {
				System.out.println("Hello");
				
				break outer;
			}
			System.out.println("This is the outer loop " + i);
		}
		System.out.println("Good Bye");
	}
}
