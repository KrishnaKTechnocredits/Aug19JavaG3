// Largest and smallest number in unsorted array
package Neha.JavaArrayAssignment;

import java.util.Scanner;

public class LargeSmall {
	// static int[] a = { 2, 6, 3, 9, 11 };
	static void findLargeNum(int[] a) {

		int large = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			}
		}
		System.out.println(large + " is the largest number in the given array");
	}

	static void findSmallNum(int[] a) {
		int small = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < small) {
				small = a[i];
			}
		}
		System.out.println(small + " is the smallest number in the given array");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements for the array: ");
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		findLargeNum(array);
		findSmallNum(array);
	}
}
