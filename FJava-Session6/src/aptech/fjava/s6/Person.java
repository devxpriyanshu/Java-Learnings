package aptech.fjava.s6;

public class Person {
	private String name;

	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	/**
	 * Displays the details of Person object
	 */
	public void displayDetails() {
		System.out.println("Person Details");
		System.out.println("==============");
		System.out.println("Person Name: " + name);
		System.out.println("Persons Age is: " + age);
	}
}
