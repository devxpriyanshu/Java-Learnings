package aptech.fjava.session7;

public class PassByRef {
	// Method to calculate area of a circle that
	// takes the object of class Circle as a parameter

	public void calcArea(Circle objPi, double rad) {
		
		double area = objPi.getPI() * rad * rad; // Use getPI() method to retrieve the value of PI
		
		System.out.println("Area of the circle is: " + area); // Print the value of area of circle
	}

	public static void main(String[] args) {
		
		PassByRef p1 = new PassByRef(); // Instantiate the PassByRefclass
		
		Circle c1 = new Circle(); // Invoke the calcArea() method with object of class Circle as a parameter
		
		p1.calcArea(c1, 5);
	}
}