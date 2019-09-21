package Assignment4;

import java.util.Scanner;

public class EX9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.next();

		String temp = "";
		char ch[] = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			temp = temp + ch[i];
		}
		if (str.equals(temp)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not palindrome");
		}
	}
}
