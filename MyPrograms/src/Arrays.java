
public class Arrays {

	public static void main(String[] args) {
		
//		String[] cars = {"Audi", "BMW", "Maruti"}; //simple array assigning method
//		
//		cars[2]="Porche"; 
//		
//		System.out.println(cars[2]);
		
		String[] cars = new String[3];
		
		cars[0]="Porche";
		cars[1]="Audi";
		cars[2]="Ferarri";
		
		
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
	}

}
