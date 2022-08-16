package Day5;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A : ");
		int a = sc.nextInt();	
		System.out.println("Enter B : ");
		int b = sc.nextInt();
		int temp ;
		temp = a;
		a=b;
		b=temp;
		System.out.println("After swap value of A and B are respectively "+ a +" and "+b);
	}

}
