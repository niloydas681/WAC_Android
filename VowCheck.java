package WAC1;

import java.util.Scanner;

public class VowCheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);

		if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Vowel");
				break;
			default:
				System.out.println("Consonant");
			}
		} 
		else
			System.out.println("Not an alphabet");
	}
}
