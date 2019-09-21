// print even number from the array

package Neha;

import java.util.Scanner;

public class EvenNum {
	static void evenNum(int[] a) {
		// int[] a = {15, 24, 52, 49, 62, 10};
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + "\t");
			}
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
		evenNum(array);
	}
}
