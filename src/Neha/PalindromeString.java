
// Find string is palindrome or not
package Neha;

import java.util.Scanner;

public class PalindromeString {
	static void palindromeString(String str) {
		//String str = "naman";
		String rev = "";
		{
			for (int i = str.length() - 1; i >= 0; i--) {
				rev = rev + str.charAt(i);

			}
		}
		if (str.equals(rev)) {
			System.out.println("Word is palindrome");
		} else {
			System.out.println("Word is not palindrome");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String word = sc.next();
		palindromeString(word);
	}
}
