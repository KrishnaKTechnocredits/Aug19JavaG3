// Find duplicate number on Integer array
package Neha;

import java.util.Scanner;

public class DuplicateNumber {
	static void dupNum(int[] a) {
		//5int[] a = { 0, 1, 3, 2, 3, 4 };
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					flag = true;
					System.out.println("Duplicate value in the given array is: " + a[i]);
				}

			}

		}
		if (flag == false) {
			System.out.println("There are no duplicate values");
		}
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
		dupNum(array);
	}

}
