/* Write a Java program that keeps a number from the user and generates an integer between 1 and 7 
 and displays the name of the weekday. (use switch case)*/

package Neha;

import java.util.Scanner;

public class Week {


	static void calculateWeek(int x) {
		switch (x) {
		case 1:
			System.out.println("The " +x+"st day of the week is Monday");
			break;

		case 2:
			System.out.println("The " +x+"nd day of the week is Tuesday");
			break;

		case 3:
			System.out.println("The " +x+"rd day of the week is Wednesday");
			break;

		case 4:
			System.out.println("The " +x+"th day of the week is Thursday");
			break;
			
		case 5:
			System.out.println("The " +x+"th day of the week is Friday");
			break;

		case 6:
			System.out.println("The " +x+"th day of the week is Saturday");
			break;

		case 7:
			System.out.println("The " +x+"th day of the week is sunday");
			break;

		default:
			System.out.println("There are only 7 days in a week");

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1 and 7");
		int x = sc.nextInt();
		calculateWeek(x);
	}
}
