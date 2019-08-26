package Neha;

public class VowelCount {
	static int a = 0;
	static int e = 0;
	static int i = 0;
	static int o = 0;
	static int u = 0;

	static void printVowelCount(String input, char ch) {

		int count = 0;

		for (int j = 0; j < input.length(); j++) {
			if (input.charAt(j) == ch) {
				count++;
			}
		}
		System.out.println(ch + ":" + count);
	}

	public static void main(String[] args) {

		printVowelCount("Technocredits", 'a');
		printVowelCount("Technocredits", 'e');
		printVowelCount("Technocredits", 'i');
		printVowelCount("Technocredits", 'o');
		printVowelCount("Technocredits", 'u');

	}

}
