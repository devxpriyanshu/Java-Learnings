package aptech.fjava.session7;

public class Varargs {
	// Variable argument method taking variable number of integer arguments
	public void addNumber(int... num) {
		int sum = 0;
		
		// Use for loop to iterate through num
		for (int i : num) {
			// Add up the values
			sum = sum + i;
		}
		// Print the sum
		System.out.println("Sum of numbers is " + sum);
	}

	public void concat(String... str) {
		String finalStr = "";

		for (int i = 0; i < str.length; i++) {

			finalStr = finalStr + str[i];

		}

		System.out.println("Concatinated stirng is : " + finalStr);
	}

	public static void main(String[] args) {
		// Instantiate the Varargsclass
		Varargs obj = new Varargs();
		// Invoke the addNumber() method with multiple arguments
		obj.addNumber(1, 3, 2, 4, 5, 6, 7, 100);

		obj.concat("Priyanshu ", "Dutta ", "Says, ", "Whatsup! ", "Fella");
	}
}
