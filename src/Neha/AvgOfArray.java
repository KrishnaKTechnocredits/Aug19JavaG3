// Avg of the array
package Neha;

import java.util.Scanner;

public class AvgOfArray {
	static float avg(int[] a) {
		// int[] a = {14,32,19,14,78,36};
		int sum = 0;
		float avg1 = 0.0f;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		avg1 = (float) sum / a.length;
		// System.out.println(avg);
		return avg1;
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

		avg(array);
		float average = avg(array);
		System.out.println(average);
	}
}
