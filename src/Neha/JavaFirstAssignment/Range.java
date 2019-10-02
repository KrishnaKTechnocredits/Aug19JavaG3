/* Write a program to list all the integers between two integers L and R (including L and R). 
L and R can be any integer between 1 and 100. 1≤L,R≤100.
Sample Input:
L = 5, R = 10
Sample Output:
5 6 7 8 9 10 */

package Neha.JavaFirstAssignment;

public class Range {
	public static void PrintNumberRanges(int start, int end) {
		System.out.println("Printing the numbers\n");
		for (int i = start; i <= end; i++) {
			System.out.print(i + "\t");

		}

	}

	public static void main(String[] args) {
		PrintNumberRanges(5, 10);

	}
}
