/* Create a Square class with field side, one parameterized constructor which accept side value . 
 * Write a method to find the area of a square. Write a TestSquareClass to verify Square class functionality.
 * NOTE : square method should not take any parameter, constructor should set side value in instance variable 
and square method should use that instance variable.
(area=side*side)*/
package Neha.CoreJavaAssignments;

import java.util.Scanner;

public class TestSquareClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of the square to calculate the area");
		int lenght = sc.nextInt();
		Square s = new Square(lenght);
		s.area();
	}

}
