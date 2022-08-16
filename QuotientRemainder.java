package Day5;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a dividend : ");
		int dividend = sc.nextInt();
		System.out.println("Enter a divisor : ");
		int divisor = sc.nextInt();
		System.out.println("Quotient is " + dividend/divisor);
		System.out.println("Remainder is " + dividend%divisor);

	}

}
