/*Write a program to calculate area of Rectangle, area of Triangle and area of Circle using switch statement. 
Make it a menu driven program..
Formulas:-Area Of rectangle=length*breadth 
Area of triangle=1/2*base*height 
Area of Circle=3.14*radius*radius*/
package Neha;

import java.util.Scanner;

public class Area {
	static void area(int l, int b, String s) {
		switch (s) {
		case "rectangle":
			System.out.println("Result: " + (l * b));
			break;

		case "triangle":
			System.out.println("Result: " + ((0.5) * (l * b)));
			break;

		case "circle":
			System.out.println("Result: " + (3.14 * (l * l)));
			break;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length to calculate area");
		int l = sc.nextInt();
		System.out.println("Enter a height to calculate area");
		int b = sc.nextInt();
		System.out.println("Enter operation you want to perform");
		String area = sc.next();
		area(l, b, area);
	}
}
