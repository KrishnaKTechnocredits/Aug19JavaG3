/* Create Employee class and parameterized constructor with attributes empId , empName and salary. 
 * Write a method to display the details of employees. 
 * Create a TestEmployee class to test Employee class functionality.*/
package Neha;

public class Employee {
	private int id;
	private String name = "";
	private int salary;

	Employee(int empId, String empName, int salary) {
		id = empId;
		name = empName;
		this.salary = salary;
	}

	void display() {
		if (id > 0 & (name != " " || name != null)) {
			System.out.println("Hi " + name + ",");
			System.out.print("Your Employee Id is " + id + " and salary is " + salary);
		} else
			System.out.println("You have not provided correct information.");
	}

}
