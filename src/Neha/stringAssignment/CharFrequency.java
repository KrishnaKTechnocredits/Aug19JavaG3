// Find character occurring in user defined String and Character
package Neha.stringAssignment;

import java.util.Scanner;

public class CharFrequency {
	static void charFreq(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("The character is: "+ ch + " and the number occurence: " + count);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String ");
		String input = scanner.nextLine();
		System.out.println("Enter the character to count the frequency ");
		char ch = scanner.next().charAt(0);
		charFreq(input, ch);
	}
}
