/* Create a Square class with field side, one parameterized constructor which accept side value . 
 * Write a method to find the area of a square. Write a TestSquareClass to verify Square class functionality.
 * NOTE : square method should not take any parameter, constructor should set side value in instance variable 
and square method should use that instance variable.
(area=side*side)*/
package Neha.CoreJavaAssignments;

public class Square {
	private int side;
	
	Square(int s){
		side = s;
	}
	void area() {
		if(side>0) {
			int area = side*side;
			System.out.println("The area of the square is: " + area);
		}
		else
			System.out.println("You have entered incorrect measurements");
	}

}
