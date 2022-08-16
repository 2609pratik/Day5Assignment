package Day5;

import java.util.Scanner;

public class ConsenentVovel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character ");
		char n = scanner.next().charAt(0);
		if (n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U') {
			System.out.println(n+" is a Vovel");
		}
		else {
			System.out.println(n+" is a Consonant");

		}
	}

}
