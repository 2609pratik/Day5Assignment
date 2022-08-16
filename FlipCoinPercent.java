package Day5;

import java.util.Iterator;
import java.util.Scanner;

public class FlipCoinPercent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of time coin flipped");
		float count = sc.nextInt();
		int count0 = 0;
		int count1 = 0;
		for(int i=0;i<count;i++) {
			float flip = (float) (Math.random());
			//System.out.println("     "+ flip);
			if(flip<0.5) {
				count0++;
			}
			else {
				count1++;
			}
		}
		//System.out.println(count1 +" "+count0 );
		float head =(float)(count1/count*100);
		float tail = (float)(count0/count*100);
		//System.out.println(head +" "+tail);
		System.out.println("Head percentage is : " + head);
		System.out.println("Tail percentage is : " + tail);
	}

}
