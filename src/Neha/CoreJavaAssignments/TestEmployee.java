/* Create Employee class and parameterized constructor with attributes empId , empName and salary. 
 * Write a method to display the details of employees. 
 * Create a TestEmployee class to test Employee class functionality.*/

package Neha.CoreJavaAssignments;

import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter you name");
		String name = sc.next();
		System.out.println("Enter you salary");
		int sal = sc.nextInt();

		Employee em = new Employee(id, name, sal);
		em.display();
	}

}
