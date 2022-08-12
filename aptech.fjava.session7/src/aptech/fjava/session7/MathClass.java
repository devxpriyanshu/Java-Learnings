package aptech.fjava.session7;

public class MathClass {

	public void add(int num1, int num2) {
		System.out.println("Result after addition is " + (num1 + num2));
	}

	public void add(int num1, int num2, int num3) {
		System.out.println("Result after addition is " + (num1 + num2 + num3));
	}

	public void add(float num1, int num2) {
		System.out.println("Result after addition is " + (num1 + num2));
	}

	public void add(int num1, float num2) {
		System.out.println("Result after addition is " + (num1 + num2));
	}


	public void add(float num1, float num2) {
		System.out.println("Result after addition of f&f is " + (num1 + num2));
		
	}


	public static void main(String[] args) {
		
		// Instantiate the MathClassclass
		MathClass objMath = new MathClass();
		
		// Invoke the overloaded methods with relevant arguments
		objMath.add(7.5F, 12);
		objMath.add(15,50);
		objMath.add(63, 27, 15);
		objMath.add(2.5f,8f);
	}
}
