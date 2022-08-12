package aptech.fjava.s6;

public class Account {
	private int accountID;
	private String holderName;
	private String accountType;
	/**
	 * Initialization block
	 */
	{
		accountID = 100;
		holderName = "Charmi";
		accountType = "Savings";
	}

	/**
	 * Displays the details of Account object
	 */
	public void displayAccountDetails() {
		System.out.println("Account Details");
		System.out.println("===============");
		System.out.println("Account ID: " + accountID + "\nAccountType: " + accountType);
		System.out.println("Account Holder Name:" + holderName);
	}
}
