package aptech.fjava.session3;

public class EnumDirection {
	
	enum Direction{
		
		North, West, South, East
	}

	public static void main(String[] args) {
		
		Direction direction;
		
		direction = Direction.East;
		
		System.out.println("Value : "+ direction);
	}

}
