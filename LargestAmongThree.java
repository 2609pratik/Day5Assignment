package Day5;

import java.util.Scanner;

public class LargestAmongThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 no : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if (a>b&&a>c) {
			System.out.println(a+" is greatest");	
		}
		else if (b>a&&b>c) {
			System.out.println(b+" is greatest");
		}
		else {
			System.out.println(c+" is greatest");
		}
	}
}
