package aptech.fjava.session6;

public class TestCustomer {
	
	public static void main(String[] args) {
	
	
		ModifiedCustomer objCustomer = new ModifiedCustomer();
		
		objCustomer.customerID = 100;
		objCustomer.customerName = "Jack";
		objCustomer.customerAddress = "123 Street";
		objCustomer.customerAge = 30;
		
		objCustomer.displayCustomerInformation();
		
		objCustomer.changeCustomerAddress("123 Fort, Main Street");
		
		objCustomer.displayCustomerInformation();
	}
}
