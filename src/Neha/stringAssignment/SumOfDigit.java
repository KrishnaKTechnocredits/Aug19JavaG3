// print sum of digit
package Neha.stringAssignment;

public class SumOfDigit {
	static void sumOfDigit(int x) {

		int sum = 0;
		while (x > 0) {
			int r = x % 10;
			sum = sum + r;
			x = x / 10;
		}
		System.out.println("Sum of given number is: " + sum);
	}

	public static void main(String[] args) {
		int number = 12345;
		sumOfDigit(number);
	}

}
