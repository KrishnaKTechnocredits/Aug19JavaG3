// find second largest element in an array of integers
package Neha.JavaArrayAssignment;

import java.util.Scanner;

public class SecondMax {
	
	

	static void max(int[] a) {
		//int[] a = { 20, 5, 6, 7, 3 };
		int max = 0;
		int secMax = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				secMax = max;
				max = a[i];
			} else if (secMax < a[i] && max > a[i]) {
				secMax = a[i];
			}
		}
		//System.out.println("maximum number is " + max);
		System.out.println("Second maximum number is " + secMax);
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
		max(array);
	}

}
