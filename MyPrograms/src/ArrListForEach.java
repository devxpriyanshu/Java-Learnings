import java.util.*;

public class ArrListForEach {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Porche");
		cars.add("Ferrari");
		cars.add("Audi");
		cars.add("Jaguar");
		
		System.out.println(cars.size());
		
		for( String i : cars) {
		
			System.out.println(i);
		
		}

	}

}
