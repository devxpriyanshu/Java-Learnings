package aptech.fjava.session8;

public class StringBuilders {
	// Instantiate a StringBuilderobject
	StringBuilder str = new StringBuilder("JAVA ");

	/**
	 * Displays strings using various StringBuildermethods
	 *
	 * @return void
	 */
	public void displayStrings() {
		// Use the various methods of the StringBuilderclass
		System.out.println("Appended String is " + str.append("7"));
		System.out.println("Inserted String is " + str.insert(5, "SE "));
		System.out.println("Deleted String is " + str.delete(4, 7));
		System.out.println("Reverse String is " + str.reverse());
	}

	/**
	 * @paramargsthe command line arguments
	 */
	public static void main(String[] args) {
		// Instantiate the StringBuildersclass
		StringBuilders objStrBuild = new StringBuilders(); // line 1
		// Invoke the displayStrings() method
		objStrBuild.displayStrings();
	}
}
