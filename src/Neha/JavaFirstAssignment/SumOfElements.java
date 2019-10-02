// Write a program to print the sum of all the elements of an array of size 4.
package Neha.JavaFirstAssignment;

public class SumOfElements {

	static void sumOfArray() {
		int sum = 0;
		int a[] = { 1, 2, 3, 4 };
		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}
		System.out.println("Sum:" + sum);
	}

	public static void main(String[] args) {
		sumOfArray();
	}
}
