// Count vowel in string
package Neha;

import java.util.Scanner;

public class CountVowels {
	static void vowelsCount(String str) {
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		for (int z = 0; z < str.length(); z++) {
			switch (str.charAt(z)) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
			}
		}
		System.out.println("Total vowel count is " + (a + e + i + o + u));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String str = sc.nextLine();
		str = str.toLowerCase();
		vowelsCount(str);
	}

}
