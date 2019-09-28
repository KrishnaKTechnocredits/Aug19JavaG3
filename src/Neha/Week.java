/* Write a Java program that keeps a number from the user and generates an integer between 1 and 7 
 and displays the name of the weekday. (use switch case)*/

package Neha;

import java.util.Scanner;

public class Week {

	static void calculateWeek(int x) {
		int date = x % 7;
		if (date >= 31) {
			switch (date) {
			case 1:
				System.out.println(x + " is Monday");
				break;

			case 2:
				System.out.println(x + " is Tuesday");
				break;

			case 3:
				System.out.println(x + " is Wednesday");
				break;

			case 4:
				System.out.println(x + " is Thursday");
				break;

			case 5:
				System.out.println(x + " is Friday");
				break;

			case 6:
				System.out.println(x + " is Saturday");
				break;

			case 7:
				System.out.println(x + " is sunday");
				break;

			default:
				System.out.println("There are only 7 days in a week");

			}
		}
		else
			System.out.println("There can be maximum 31 days in a month");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date");
		int x = sc.nextInt();
		calculateWeek(x);
	}
}
