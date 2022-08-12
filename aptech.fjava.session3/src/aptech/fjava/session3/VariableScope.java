package aptech.fjava.session3;

public class VariableScope {
	
	public static void main(String[] args) {
		int value1 = 10;
		int value2 = 20;
		String result;
		// boolean someCondition = f;

		result = (value1 == value2) ? "Values are  equal" : "Values are not equal";
		System.out.println(result);
	}

}
