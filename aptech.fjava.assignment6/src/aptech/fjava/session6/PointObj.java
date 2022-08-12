package aptech.fjava.session6;

import java.util.Scanner;

public class PointObj {
	
	int x ,y;
	Scanner scanner = new Scanner(System.in);
	
	public int setX(){
		x = scanner.nextInt();
		return x;
	}
	
	public int setY(){
		y = scanner.nextInt();
		return y;
	}
	public void displayPoints(int x, int y) {
		System.out.println(x+" & "+y);
	}

	public static void main(String[] args) {
		
		PointObj obj1 = new PointObj();
		PointObj obj2 = new PointObj();
		
		int x1 = obj1.setX();
		int y1 = obj1.setY();
		int x2 = obj1.setX();
		int y2 = obj1.setY();
		
		obj1.displayPoints(x1,y1);
		obj2.displayPoints(x2,y2);
		
		if(x1==x2 && y1 == y2) {
			System.out.println("Points are same.");
		}
		else
			System.out.println("Points are different.");
		
		
	}

}
