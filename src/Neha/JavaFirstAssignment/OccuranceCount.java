package Neha.JavaFirstAssignment;

//You are given a string S. Count the number of occurrences of all the digits in the string S.

public class OccuranceCount {

	static void Occur(String str, char c) {
		int count = 0;
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == c)
				count++;
		}
		System.out.println(c + ":" + count);
	}

	public static void main(String[] args) {
		String input = "1997";
		for (int k = 0; k < input.length(); k++) {
			int currindex = input.indexOf(input.charAt(k));
			if (currindex == k) {
				Occur(input, input.charAt(k));
			}

		}

	}

}
