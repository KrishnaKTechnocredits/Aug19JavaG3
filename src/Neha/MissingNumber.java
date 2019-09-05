//Find the missing number in integer array of 1 to 10

package Neha;

import java.util.Scanner;

public class MissingNumber {
	static void missingNum(int[] a) {
		// int a[] = { 1, 3, 4, 5, 6, 7, 8, 10 };
		for (int i = 1; i <= 10; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == i) {
					count = 1;
				}

			}
			if (count == 0) {
				System.out.println("The missing number is " + i);
			}

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
		missingNum(array);
	}
}
