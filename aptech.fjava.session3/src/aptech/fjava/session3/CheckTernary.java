package aptech.fjava.session3;

public class CheckTernary {

	public static void main(String[] args) {
		
		double orderValue = 2000.00;
		
		double finalPayment ;
		
		finalPayment = orderValue > 1000 ? orderValue*0.9 : orderValue;
		
		if (orderValue > 1000)
			System.out.println("You need to pay Rs :" +  finalPayment + "\nCongratulations! You got discount of Rs:" + orderValue*0.1);
		else 
			System.out.println("You need to pay Rs :" +  finalPayment );
	}

}