/* You are given a string S, which comprises English alphabets, determine the count of all the vowels in S. Vowels are [a,e,i,o,u].
 *  Print the count of all the vowels that are available in the string S.
Approach:
There are five vowels in English alphabet. Declare variables for five integers and initialize them as 0.
Traverse the string S, character by character, check if the character is vowel. If it is, increment the count of that vowel by 1.
Print out the count of each vowel after the iteration over the string is done.
*/
package Neha.JavaFirstAssignment;

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
