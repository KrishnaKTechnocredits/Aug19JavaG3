// Reverse and capital on even (O/p: llA GNINROM dooG IH )
package Neha.stringAssignment;

public class ReverseOfString {
	static void reverse() {
		String s = "Hi Good Morning All";
		String[] rev = s.split(" ");
		for (int i = rev.length - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				for (int j = rev[i].length() - 1; j >= 0; j--) {
					System.out.print(rev[i].toUpperCase().charAt(j));
				}
			} else {
				for (int j = rev[i].length() - 1; j >= 0; j--) {
					System.out.print(rev[i].charAt(j));
				}
			}
			System.out.print(" ");
		}

	}

	public static void main(String[] args) {
		reverse();
	}

}
