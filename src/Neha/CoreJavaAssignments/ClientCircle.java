/*Create a Circle class with fields radius as float Initialize the radius through method .
 * Also create separate method to calculate Area and Circumference of a Circle. 
 * Create another class as ClientCircle and call the respective methods.*/
package Neha.CoreJavaAssignments;

import java.util.Scanner;

public class ClientCircle {
	public static void main(String[] args) {
		Circle c = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of the circle");
		float r = sc.nextFloat();
		c.circle(r);
		c.area();
	}

}
