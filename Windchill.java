package Day5;

import java.util.Scanner;

public class Windchill {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature : ");
		double t = scanner.nextInt();
		System.out.println("Enter wind speed in miles/hour : ");
		double v = scanner.nextInt();
		if (t<=50&&v>3&&v<120) {
			float w = (float) (35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16));
			System.out.println("wind chill : "+ w);
		}
		else {
			System.out.println("Enterd temperature or wind speed is out of range");
		}

	}

}
