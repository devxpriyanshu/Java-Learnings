package aptech.fjava.session8;

public class AutoUnbox {
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		Character chBox = 'A'; // Autoboxinga character
		char chUnbox = chBox; // Unboxinga character
		// Print the values
		System.out.println("Character after autoboxing is:" + chBox);
		System.out.println("Character after unboxingis:" + chUnbox);
	}
}
