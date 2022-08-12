import javax.swing.JOptionPane;

public class FirstGui {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter Your name"); 		
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age")); 		
		JOptionPane.showMessageDialog(null, "Your age is "+age);
		
		double hieght= Double.parseDouble(JOptionPane.showInputDialog("Enter Your age")); 		
		JOptionPane.showMessageDialog(null, "Your name, age & hieght is "+name+", "+age+" & "+hieght+".");

	}

}
