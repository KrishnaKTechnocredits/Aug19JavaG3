package Neha.JavaArrayAssignment;

import java.util.Scanner;

public class SumOfPair {
	static void sum(int[] a) {
		//int[] a = { 2, 4, 3, 5, 7, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if ((a[i] + a[j]) == 7) {

					System.out.println(a[i] + " + " + a[j] + " = 7");
				}
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
		sum(array);
	}
}
