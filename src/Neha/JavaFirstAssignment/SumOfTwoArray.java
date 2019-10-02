/* Write a program to add the corresponding elements of two arrays, each of size N and print the sums.
 *  N can be any integer between 1 and 100. 1≤N≤100
Sample Input: N= 3 numArrayA = 3 9 8
numArrayB = 8 12 74
Sample Output:
11 21 82*/
package Neha.JavaFirstAssignment;

public class SumOfTwoArray {
	static void sumOfArray(int[] a, int[] b) {
		int[] sum = new int[a.length + b.length];
		for (int i = 0; i < sum.length; i++) {
			sum[i] = a[i] + b[i];
			System.out.print(sum[i] + "\t");

		}

	}

	public static void main(String[] args) {
		int array[] = { 2, 3, 4, 5, 6 };
		int array2[] = { 5, 6, 7, 3, 7 };

		sumOfArray(array, array2);
	}

}
