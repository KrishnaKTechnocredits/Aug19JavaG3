// Check if array contains a number
package Neha;

import java.util.Scanner;

public class FindNum {
	static void findNum(int[]a, int num)
	{
//		int[] a = {1,2,3,4,5};
//		int num = 8;
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
		if (a[i] == num) {
			cnt = 1;
		System.out.println("The number " + num + " is present in the given array");
		} }
		if (cnt == 0) {
		System.out.println("The number " + num + " is not present in the given array");
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
		System.out.println("Enter the number");
		int number = sc.nextInt();
		findNum(array,number);
	}

}
