
public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		String[][] cars = { 
				{"Maruti", "Ferrari"},
				{"Hyundai","Lexus"}
		};
		
//		String[][] cars = new String[2][2];
//		
//		cars[0][0] = "Maruti";
//		cars[0][1] = "Ferrari";
//		cars[1][0] = "Hyundayi";
//		cars[1][1] = "Lexus";
		
		System.out.println(cars[1][1]);
		
		for (int i=0; i<cars.length; i++) {
			System.out.println("");
			for(int j=0; j<cars.length; j++) {
				System.out.print(cars[i][j]+" ");
			}
		}

	}

}
