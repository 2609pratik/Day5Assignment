package Day5;

import java.util.Scanner;

public class PrimeFactoriztion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("factorization of a no : ");
		int n = scanner.nextInt();
		int temp=n;
		for(int i=2;i<=n/2;i++) {
			for( int j=2;j<=n/2;j++) {
				if (temp%j==0) {
					System.out.print(j + " ");
					temp/=j;
					break;
				}
			}	
		}
		
		
	}

}
