package Day5;

import java.util.Scanner;

public class NthHarmonic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of terms untill user want sum of harmonic ");
		int n = scanner.nextInt();
		if (n==0) {
			System.out.println("Invalid");
			
		}
		else {
			float sum = 0.0f;
			for(int i=1;i<=n;i++) {
				System.out.print("1/"+i+"+");
				sum += 1.0f/i;
			}
		System.out.println("Sum till Nth harmonic :"+ sum);
			
		}
	}

}
