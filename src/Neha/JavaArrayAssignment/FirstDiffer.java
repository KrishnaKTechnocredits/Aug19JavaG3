//Find first differ index from given arrays

package Neha.JavaArrayAssignment;

import java.util.Scanner;

public class FirstDiffer {
	static void differ(int[] a, int[] b) {
//		int[] a = { 10, 2, 9, 14, 3 };
//		int[] b = { 10, 2, 18, 14, 3 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				System.out.println("Values are not matching at index: " + i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements for the array1: ");
		int[] array1 = new int[size];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter the elements for the array2: ");
		int[] array2 = new int[size];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
		}
		differ(array1, array2);
	}
}
