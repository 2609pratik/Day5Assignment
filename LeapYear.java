package Day5;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter four digit year : ");
		int year = sc.nextInt();
		if (year>999&&year<10000) {
			if (year%100==0&&year%400==0) {
				System.out.println("leap year");
			
			}
			else if (year%100!=0&&year%4==0) {
				System.out.println("leap year");
				
			}
			else {
				System.out.println("not a leap year");
			}
		}
		else {
			System.out.println("invalid year");
		}
	}

}
