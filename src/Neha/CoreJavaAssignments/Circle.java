/*Create a Circle class with fields radius as float Initialize the radius through method .
 * Also create separate method to calculate Area and Circumference of a Circle. 
 * Create another class as ClientCircle and call the respective methods.*/
package Neha;

public class Circle {
	private float radius;

	void circle(float r) {
		radius = r;
	}

	void area() {
		if (radius > 0) {
			System.out.println("Area of the circle is " + (3.14 * radius * radius));
			System.out.println("Circumference of the circle is: " + (2 * 3.14 * radius));
		} else
			System.out.println("Enter valid and positive radius");
	}

}
