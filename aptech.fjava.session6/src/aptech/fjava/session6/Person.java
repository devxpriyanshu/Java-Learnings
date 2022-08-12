package aptech.fjava.session6;

public class Person {
	
	
	String name; 
	// private String name; 
	//it will show error if we declare it private 
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public void displayDetails() {
		System.out.println("==============");
		System.out.println("Person Details");
		System.out.println("Person Name: " + name);
		System.out.println("Persons Age is: " + age);
	}
}
