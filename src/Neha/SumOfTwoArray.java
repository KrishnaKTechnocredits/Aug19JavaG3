package Neha;

import java.util.Scanner;

public class SumOfTwoArray {
	static void sumOfArray(int[] a, int[] b) {
//		int[]a = {1,5,9,3,7};
//		int[]b = {1,7,9,3};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		for (int i = 0; i < b.length; i++) {
			sum = sum + b[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array1: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements for the array1: ");
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the size of Array2: ");
		int size1 = sc.nextInt();
		System.out.println("Enter the elements for the array2: ");
		int[] array2 = new int[size1];
		for (int j = 0; j < array2.length; j++) {
			array2[j] = sc.nextInt();
		}

		sumOfArray(array, array2);
	}

}
