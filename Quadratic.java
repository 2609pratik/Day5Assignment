package Day5;

import java.util.Scanner;

public class Quadratic {
	public static void roots(float a,float b,float c) {
		float delta = (float) b*b-4*a*c;
		if (delta>=0) {
			float r1 =(float)(-b + Math.sqrt(delta))/2*a;
			float r2 = (float)(-b - Math.sqrt(delta))/2*a;
			System.out.println(r1);
			System.out.println(r2);
		}
		else {
			delta = Math.abs(delta);
			System.out.println(("("+-b+"+"+ (float)Math.sqrt(delta))+"i)/"+2*a);
			System.out.println(("("+-b+"-"+ (float)Math.sqrt(delta))+"i)/"+2*a);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter te terms of quadratic equation respectively\n a*x*x+b*x+c=0\n ");
		System.out.print("a : ");
		float a = scanner.nextInt();
		System.out.print("b : ");
		float b = scanner.nextInt();
		System.out.print("c : ");
		float c = scanner.nextInt();
		roots(a,b,c);
	}
}
