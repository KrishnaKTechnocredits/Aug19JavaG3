// Write a Java program that takes a year from user and print whether that year is a leap year or not
package Neha;

import java.util.Scanner;

public class Year {
	void year(int y) {
		if (y % 4 == 0)
			System.out.println(y + " is a leap year");
		else
			System.out.println(y + " is not a leap year");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year in YYYY format");
		int year = sc.nextInt();
		Year y = new Year();
		y.year(year);
	}

}
