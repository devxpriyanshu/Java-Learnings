package aptech.fjava.session6;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee objEmp1 = new Employee();
		
		objEmp1.employeeName = "Sagar";
		objEmp1.employeeAge = 26;
		objEmp1.employeeSalary = 30000;
		objEmp1.maritalStatus = true;

		objEmp1.displayEmployeeDetails();
		objEmp1.perYear();

		System.out.println("----------------------------");
		Employee objEmp2 = new Employee();

		objEmp2.employeeName = "Priyanshu";
		objEmp2.employeeAge = 22;
		objEmp2.employeeSalary = 150000;
		objEmp2.maritalStatus = false;

		objEmp2.displayEmployeeDetails();
		objEmp2.perYear();

	}
}
