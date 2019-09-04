// find the frequency of user defined character in user defined String
package Neha;

import java.util.Scanner;

public class CharFreq {
	static void charFreq(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Frequency of " + ch + "is" + count + " in " + input);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String ");
		String input = scanner.next();
		System.out.println("Enter the character to count the frequency ");
		char ch = scanner.next().charAt(0);
		charFreq(input, ch);
	}

}
