// Find sum of given number
package Neha;

import java.util.Scanner;

public class SumOfNumber {
	static void sumOfNumber(int x) {
		// int x = 159753;
		int sum = 0;
		while (x > 0) {
			int r = x % 10;
			sum = sum + r;
			x = x / 10;
		}
		System.out.println("Sum of given number is: " + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to add: ");
		int number = sc.nextInt();
		sumOfNumber(number);
	}
}