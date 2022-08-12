package aptech.fjava.session3;

public class VariableScopeFormat {

	public static void main(String[] args) {
		
		int num = 2;
		
		double result = num * num;
		
		System.out.format(" The square of %d is %f.",num,result);

	}

}
