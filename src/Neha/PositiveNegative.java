// Find positive & negative number from the array and check the sum
package Neha;

import java.util.Scanner;

public class PositiveNegative {
	static void sumOfPosNeg(int[] a) {
		// int[] a = { 5, 6, -9, 14, -25, 6, 7, -14 };
		int positive = 0;
		int negative = 0;
		int p_count = 0;
		int n_count = 0;
		int[] arr1 = new int[a.length];
		int[] arr2 = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {

				arr1[p_count] = a[i];
				p_count++;
				positive = positive + a[i];

			} else {
				arr2[n_count] = a[i];
				n_count++;
				negative = negative + a[i];
			}
		}
		for (int j = 0; j < p_count; j++)
			System.out.println("Postive numbers are : " + arr1[j]);
		System.out.println("The sum of positive numbers are: " + positive);
		for (int j = 0; j < n_count; j++)
			System.out.println("Negative numbers are : " + arr2[j]);
		System.out.println("The sum of negative numbers are: " + negative);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sumOfPosNeg(array);

	}
}