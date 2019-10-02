/* You are given two numbers N and M, print the absolute difference between two numbers i.e. |N−M|
Approach:
Store the difference of N and M in a temporary variable result. Check if the value of result is negative.
The question is to print the absolute difference. 
Therefore, if the value is negative, then make it positive by multiplying it with −1. Print out the value of result.
*/
package Neha.JavaFirstAssignment;

public class AbsoluteDifference {
	static void absolutediff(int x, int y) {

		int result = 0;
		result = x - y;
		if (result < 0) {
			result = result * -1;
			System.out.println("Absolute Diff: " + result);
		} else {
			System.out.println("Difference: " + result);
		}

	}

	public static void main(String[] args) {
		absolutediff(3, 7);
	}

}
