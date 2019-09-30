package Neha.JavaArrayAssignment;

import java.util.Scanner;

public class EqualityOfArray {
	static void equalArray(int[] a, int[] b) {
//		int[] a = { 21, 57, 11, 37, 24 };
//		int[] b = { 21, 57, 11, 37, 24 };
		int count = 0;
		for (int i = 0, j = 0; i < a.length; i++, j++) {

			if (a[i] != b[j]) {
				count++;

			}

		}
		if (count == 0) {
			System.out.println("Two Arrays Are Equal ");
		} else {
			System.out.println("Two Arrays Are Not Equal ");
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
		equalArray(array1, array2);
	}

}
