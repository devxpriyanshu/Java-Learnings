package aptech.fjava.s6;

public class ModifiedCustomer {

	// Declare instance variables
	int customerID;
	String customerName;
	String customerAddress;
	int customerAge;

	/**
	 * Declares an instance method changeCustomerAddressis created to change the
	 * address of the customer object
	 */
	void changeCustomerAddress(String address) {
		customerAddress = address;
	}

	/**
	 * Declares an instance method displayCustomerInformationis created to display
	 * the details of the customer object
	 */
	void displayCustomerInformation() {
		System.out.println("Customer Identification Number: " + customerID);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer Address: " + customerAddress);
		System.out.println("Customer Age: " + customerAge);
	}
}
