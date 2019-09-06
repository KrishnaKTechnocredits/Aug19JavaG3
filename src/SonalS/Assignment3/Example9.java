//WAP to find the avg of given array elements
package Assignment3;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		System.out.println("Please Enter the elements of array:");
		int inputArray[] = new int[size];
		for (int i = 0; i < size; i++) {
			inputArray[i] = sc.nextInt();
		}

		printAvg(inputArray, size);

	}

	private static void printAvg(int[] inputArray, int size) {
		// TODO Auto-generated method stub
		int addition = 0;
		int avg = 0;
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 1 + 1; j < inputArray.length; j++) {
				addition = inputArray[i] + inputArray[j];
			}

		}
		System.out.println("Addition is:" + addition);
		avg = addition / size;
		System.out.println("Average is:" + avg);
	}

}
