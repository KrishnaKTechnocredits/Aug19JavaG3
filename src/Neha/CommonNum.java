// print common number from two different array
package Neha;

import java.util.Scanner;

public class CommonNum {
	static void common(int[] a, int[] b) {
//	int[] a = {1,3,6,9,7};
//	int[] b = {2,5,6,9,8};
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				System.out.println("Common value are " + a[i] + " at index: " + i);
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
		common(array1, array2);
	}
}
