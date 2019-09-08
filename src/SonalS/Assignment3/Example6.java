//WAP to find reverse max length string.
package Assignment3;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		String inputArray[] = new String[size];
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = sc.next();
		}
		printMaxReverseString(inputArray);
	}

	private static void printMaxReverseString(String[] inputArray) {
		// TODO Auto-generated method stub
		String maxName = "";
		int max = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (max < inputArray[i].length()) {
				max = inputArray[i].length();
				maxName = inputArray[i];
			}
		}
		System.out.println("Maximum Length string from given array:" + maxName);

		char ch[] = maxName.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print("Reverse string: "+ch[i]);
		}
	}

}
