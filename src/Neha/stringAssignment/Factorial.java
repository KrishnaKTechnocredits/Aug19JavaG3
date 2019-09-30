// print factorial number
package Neha.stringAssignment;

import java.util.Scanner;

public class Factorial {
	static void factNum(int num) {
		//int num = 5;
		int facto = 1;
		for (int i = 1; i <= num; i++) {
			facto = facto * i;
		}
		System.out.println(facto);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		factNum(number);
	}
}
