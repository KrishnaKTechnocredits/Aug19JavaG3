// print unique number from the two different array
package Neha;

import java.util.Scanner;

public class UniqueNumber {
	static void getUniqueNumber(int[] num1, int[] num2) {

		int index = 0;
//		int[] num1 = { 1, 3, 6, 9, 7 };
//		int[] num2 = { 2, 5, 6, 9, 8 };
		int[] unique = new int[num1.length + num2.length];
		for (int i = 0; i < num1.length; i++) {
			boolean flag = false;
			for (int j = 0; j <= num2.length; j++) {
				if (num1[i] == unique[j]) {
					flag = true;
					break;
				}
				if (flag == false) {
					unique[i] = num1[i];
					index++;

				}
			}
		}
		for (int i = 0; i < unique.length; i++) {
			if (unique[i] != 0) {
				System.out.println(unique[i]);
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
		getUniqueNumber(array1, array2);
	}

}
