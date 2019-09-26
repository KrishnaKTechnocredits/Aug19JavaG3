//Write a Java Program and create Calculator using switch statement

package Neha;

import java.util.Scanner;

public class Calculator {

	static void cal(int x, int y, String c) {
		switch (c) {
		case "+":
			System.out.println("Result: " + (x + y));
			break;

		case "-":
			System.out.println("Result: " + (x - y));
			break;

		case "*":
			System.out.println("Result: " + (x * y));
			break;

		case "/":
			System.out.println("Result: " + (x / y));
			break;

		default:
			System.out.println("Enter valid method.");

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1");
		int x = Integer.parseInt(sc.next());
		System.out.println("Enter number2");
		int y = Integer.parseInt(sc.next());
		System.out.println("Enter operation you want to perform");
		String str = sc.next();
		cal(x, y, str);
	}
}
