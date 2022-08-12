
public class SwitchDays {

	public static void main(String[] args) {
		
		String Day="Moday";
		
		switch(Day){
		case "Sunday" : System.out.println("Holiday");
		break;
		case "Monday" : System.out.println("Monday Sucks!");
		break;
		case "Tuesday" : System.out.println("Lazy Tuesday!");
		break;
		case "Wednesday" : System.out.println("I need a pizza!");
		break;
		case "Thurday" : System.out.println("Long day Thursday!");
		break;
		case "Friday" : System.out.println("Finally Friday!");
		break;
		case "Saturday" : System.out.println("Party Saturday!");
		break;
		default: System.out.println("You are Sleeping!");
		}

	}

}
