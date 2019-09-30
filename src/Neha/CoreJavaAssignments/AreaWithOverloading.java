/* Create a class Area to find the area of Square, Rectangle and Circle by creating area() method . 
 * Using overloading concept here.*/
package Neha.CoreJavaAssignments;

public class AreaWithOverloading {
	void area(int l) {
		System.out.println("Area: "+(l*l));
	}
	void area(int l, int b) {
		System.out.println("Area: "+(l*b));
	}
	void area(float r){
		System.out.println("Area: "+(3.14*(r*r)));
	}
	public static void main(String[] args) {
		AreaWithOverloading a = new AreaWithOverloading();
		a.area(2.5f);
	}

}
