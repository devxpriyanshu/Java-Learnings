package aptech.fjava.session4;

public class TestSwitchEnumeration {
	
	enum Cards{
		Spade, Heart, Diamonds, Club
	}

	public static void main(String[] args) {
		
		Cards card = Cards.Diamonds;
		
		switch(card) {
		
		case Spade : System.out.println("SPADE");
		break;
		case Heart : System.out.println("HEART");
		break;
		case Diamonds : System.out.println("DIAMONDS");
		break;
		case Club : System.out.println("CLUB");
		break;
		}

	}

}
