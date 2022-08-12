package aptech.fjava.session6;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person objPerson1 = new Person("Sagar", 26);
		
		objPerson1.displayDetails();
		objPerson1.name = "Anil";
		objPerson1.displayDetails();
	}
}
