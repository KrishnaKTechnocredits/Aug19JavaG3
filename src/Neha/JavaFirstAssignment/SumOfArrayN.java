/*Write a program to print the sum of all the elements of an array of size N where N can be any integer between 1 and 100. 
 * 1≤N≤100
Sample Input:
N=3
Array = 6 3 8 Sample Output: 17*/
package Neha.JavaFirstAssignment;

public class SumOfArrayN {

	static void sumOfArray(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}
		System.out.println("Sum:" + sum);
	}

	public static void main(String[] args) {
		int[] a = { 2, 4, 5 };
		sumOfArray(a);

	}

}
