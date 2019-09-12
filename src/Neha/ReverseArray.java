// Print reverse of given array
package Neha;

import java.util.Scanner;

public class ReverseArray {
	static void reverse(int[] a) {
		// int[] a = {5, 6, 9, 10, 14, 63};
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + "\t");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements for the array1: ");
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		reverse(array);
	}
}
