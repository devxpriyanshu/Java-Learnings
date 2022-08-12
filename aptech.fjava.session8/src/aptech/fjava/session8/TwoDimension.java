package aptech.fjava.session8;

public class TwoDimension {

	// Declare a two-dimensional array named marks
	 int marks[][]; // line 1
//	int[][] marks = { { 23, 34, 45, 67, 78 }, { 43, 56, 76, 78, 43 }, { 65, 76, 53, 75, 98 }, { 65, 76, 53, 75, 98 },
//			{ 43, 56, 76, 78, 43 } };

	/**
	 * Stores marks in a two-dimensional array
	 *
	 * @return void
	 */
	public void storeMarks() {

		// Instantiate the array
		 marks = new int[4][2]; // line 2
		;
		System.out.println("Storing Marks. Please wait...");
		// Initialize array elements

		 marks[0][0] = 23; // line 3
		 marks[0][1] = 65;
		 marks[1][0] = 42;
		 marks[1][1] = 47;
		 marks[2][0] = 60;
		 marks[2][1] = 75;
		 marks[3][0] = 75;
		 marks[3][1] = 50;
	}

	/**
	 * Displays marks from a two-dimensional array
	 *
	 * @return void
	 */
	public void displayMarks() {
//		 System.out.println("Marks are:"); // Display the marks
//		 System.out.println("Roll no.1:" + marks[0][0] + "," + marks[0][1] );
//		 System.out.println("Roll no.2:" + marks[1][0] + "," + marks[1][1] );
//		 System.out.println("Roll no.3:" + marks[2][0] + "," + marks[2][1]);
//		 System.out.println("Roll no.4:" + marks[3][0] + "," + marks[3][1] );

		for (int i = 0; i < marks.length; i++) {

			System.out.print("Roll no." + (i + 1) + ":");
			for (int j = 0; j < marks[i].length; j++) {
				System.out.print(marks[i][j]);
				if (j != 1)
					System.out.print(",");
			}
			System.out.print("\n");
		}
		
		
	}

	public void totalMarks() {

		
		for (int i = 0; i < marks.length; i++) {
			
			int sum = 0;

			System.out.print("Roll no." + (i + 1) + ":");
			for (int j = 0; j < marks[i].length; j++) {
				
				sum = sum + marks[i][j];
				
			}
			System.out.println(" total marks are :" + sum);
			System.out.print("\n");
		}
		
		
	}
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		// Instantiate class TwoDimension
		TwoDimension twoDimenObj = new TwoDimension(); // line 4
		// Invoke the storeMarks() method
		twoDimenObj.storeMarks();
		// Invoke the displayMarks() method
		twoDimenObj.displayMarks();
		twoDimenObj.totalMarks();
	}

}
