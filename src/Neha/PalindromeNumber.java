// Find number is palindrome or not
package Neha;

import java.util.Scanner;

public class PalindromeNumber {
	static void palindrome(int num) {
		// int num = 12321;
		int x = 0;
		int sum = 0;
		int num1 = 0;
		num1 = num;
		while (num > 0) {
			x = num % 10;
			num = num / 10;
			sum = sum * 10 + x;
		}

		if (num1 == sum) {
			System.out.println("The number is Palindrome");
		} else
			System.out.println("The number is not Palindrome");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		palindrome(number);
	}

}
