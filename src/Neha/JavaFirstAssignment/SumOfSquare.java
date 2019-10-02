/* Write a program to print the sum of squares of the elements of an array of size N. 
 * N can be any integer between 1 and 100. 1≤N≤100
Sample Input
N=5
Array = 4 7 2 8 5 Sample Output: 158
*/
package Neha.JavaFirstAssignment;

public class SumOfSquare {

	static void sumOfsq(int a[]) {
		int sum = 0;
		int sq = 0;

		for (int i = 0; i < a.length; i++) {
			sq = a[i] * a[i];
			sum = sum + sq;
		}
		System.out.println("Sum of square: " + sum);

	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		sumOfsq(a);
	}

}
