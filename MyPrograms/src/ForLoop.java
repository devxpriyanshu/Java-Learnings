
public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++) {
			
			System.out.println(i);
			
			switch(i){
			case 1 : System.out.println("Holiday");
			break;
			case 2 : System.out.println("Monday Sucks!");
			break;
			case 3 : System.out.println("Lazy Tuesday!");
			break;
			case 4 : System.out.println("I need a pizza!");
			break;
			case 5 : System.out.println("Long day Thursday!");
			break;
			case 6 : System.out.println("Finally Friday!");
			break;
			case 7 : System.out.println("Party Saturday!");
			break;
			default: System.out.println("You are Sleeping!");
			}
		}

	}

}
