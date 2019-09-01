package PoojaG.Assignment1;

import java.util.Arrays;

public class CountNumOfDig {

	static void charFreq(String input, char ch) {

		char[] a = input.toCharArray();
		Arrays.sort(a);

		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(ch + ":" + count);

	}

	public static void main(String[] args) {
		String input = "128896";
		for (int index = 0; index < input.length(); index++) {
			char currentChar = input.charAt(index);
			if (index == input.indexOf(currentChar))
				// System.out.println(index + ":" + input.charAt(index) + ":" +
				// input.indexOf(currentChar)
				charFreq(input, input.charAt(index));
		}
	}

}