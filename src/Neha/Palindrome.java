// Find the sting is palindrome or not
package Neha;

public class Palindrome {
	static void palindromeString(String str) {

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
		String name = "racecar";
		palindromeString(name);
	}

}
