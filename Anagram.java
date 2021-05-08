package WAC1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = sc.next();
		System.out.println("Enter the second string");
		String s2 = sc.next();

		if (s1.length() != s2.length())
			flag = false;
		else {
			int f1[] = new int[123];
			int f2[] = new int[123];

//			for (int i = 0; i < 123; i++) {
//				f1[i] = 0;
//				f2[i] = 0;
//			}

//			Arrays.fill(f1, 0);
//			Arrays.fill(f2, 0);
			for (int i = 0; i < s1.length(); i++) {
				int v1 = (char) s1.charAt(i);
				int v2 = (char) s2.charAt(i);
				f1[v1] = f1[v1] + 1;
				f2[v2] = f2[v2] + 1;
			}

			for (int i = 0; i < 123; i++) {
				if (f1[i] != f2[i]) {
					flag = false;
				break;
			}
		}

		if (flag)
			System.out.println("They are anagrams");
		else
			System.out.println("They are not anagrams");
	}
}
}