package aptech.fjava.session6;

public class Account {
	
	private int accountID;
	private String holderName;
	private String accountType;
	
	{
		accountID = 100;
		holderName = "Charmi";
		accountType = "Savings";
	}


	public void displayAccountDetails() {
		System.out.println("Account Details");
		System.out.println("===============");
		System.out.println("Account ID: " + accountID + "\nAccountType: " + accountType);
		System.out.println("Account Holder Name:" + holderName);
	}
}
