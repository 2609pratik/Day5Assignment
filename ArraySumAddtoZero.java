package Day5;

import java.util.Iterator;
import java.util.Scanner;

public class ArraySumAddtoZero {
	public static void addZero(int n,int[] arr) {
		for (int i = 0; i < n-2; i++) {
			for (int j = 1; j < n-1; j++) {
				for (int k = 2; k < n; k++) {
					if (arr[i]+arr[j]+arr[k]==0) {
						System.out.println(arr[i]+","+arr[j]+","+arr[k]+" adds to 0");
					}			
				}
			}
		}
	}
	public static void triplets(int n,int[] arr) {
		for (int i = 0; i < n-2; i++) {
			for (int j = 1; j < n-1; j++) {
				for (int k = 2; k < n; k++) {
						System.out.println(arr[i]+","+arr[j]+","+arr[k]);			
				}
			}
		}	
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter element "+ (i+1));
			arr[i]= scanner.nextInt();
		}
		addZero(n,arr);
		System.out.println("Distinct triplets");
		triplets(n,arr);	
	}
}
