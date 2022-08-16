package Day5;

import java.util.Iterator;
import java.util.Scanner;

public class PowerofTwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no to get power of 2 ");
		int n = scanner.nextInt();
		if (n==0) {
			System.out.println("0");
			
		}
		else {
			int power = 1;
			for(int i=1;i<=n;i++) {
				power = power*2;
				System.out.print(power + " ");
			}
			
		}
	}

}
