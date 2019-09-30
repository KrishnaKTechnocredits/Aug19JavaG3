/*Write a program to calculate area of Rectangle, area of Triangle and area of Circle using switch statement. 
Make it a menu driven program..
Formulas:-Area Of rectangle=length*breadth 
Area of triangle=1/2*base*height 
Area of Circle=3.14*radius*radius*/
package Neha;

import java.util.Scanner;

public class Area {
	static void area( String s) {
		Scanner sc = new Scanner(System.in);
		switch (s) {
		case "rectangle":
			
			System.out.println("Enter length to calculate area");
			int length = sc.nextInt();
			System.out.println("Enter a breadth to calculate area");
			int breadth = sc.nextInt();
			System.out.println("Area: " + (length * breadth));
			break;

		case "triangle":
			System.out.println("Enter base to calculate area");
			int base = sc.nextInt();
			System.out.println("Enter a height to calculate area");
			int height = sc.nextInt();
			System.out.println("Area: " + ((0.5) * (base * height)));
			break;

		case "circle":
			System.out.println("Enter radius to calculate area");
			int radius = sc.nextInt();
			System.out.println("Area: " + (3.14 * (radius * radius)));
			break;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter whose area to be calculated");
		String area = sc.next();
		area(area);
	}
}
