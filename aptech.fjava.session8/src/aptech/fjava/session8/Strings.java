package aptech.fjava.session8;

public class Strings {
	String str = "Hello"; // Initialize a String variable
	Integer strLength = 5; // Use the Integer wrapper class

	/**
	 * Displays strings using various String class methods
	 *
	 * @return void
	 */
	public void displayStrings() {
		// using various String class methods
		System.out.println("Character at index 2 is:" + str.charAt(4));
		System.out.println("Concatenated string is:" + str.concat(" World"));
		System.out.println("String comparison is:" + str.compareTo("World"));
		System.out.println("Index of H is:" + str.indexOf("H"));
		System.out.println("Last index of l is:" + str.lastIndexOf("l"));
		System.out.println("Replaced string is:" + str.replace('H', 'Z'));
		System.out.println("Substring is:" + str.substring(2, 5));
		System.out.println("Integer to String is:" + strLength.toString());
		String str1 = " Hello ";
		System.out.println("Untrimmed string is:" + str1);
		System.out.println("Trimmed string is:" + str1.trim());
	}

	/**
	 * @paramargsthe command line arguments
	 */
	public static void main(String[] args) {
		// Instantiate class, Strings
		Strings objString = new Strings(); // line 1
		// Invoke the displayStrings() method
		objString.displayStrings();
	}
}
