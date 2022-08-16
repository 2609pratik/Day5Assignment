package Day5;

import java.util.Scanner;
public class Distance {
	public static void lengthLine(int x, int y) {
		float len =(float) Math.sqrt((x)*(x)+(y)*(y));
		System.out.println("Length of line from origin is "+ len + " unit");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter co-ordinate of point A (x,y) ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		lengthLine(x,y);
	}
}
