
/* Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using scanner). 
 * Create 3 parameterized constructor for same.
 * Take data for 2 employees and write a method which takes 2 arguments (instance of both employees) 
and print all the details of employee having max salary.
        HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2);*/
package Neha.CoreJavaAssignments;

import java.util.Scanner;

public class EmployeeClass {
	String name,deptID;
	double salary;
	
	EmployeeClass(String name, String deptID, double salary)
	{
		this.name = name;
		this.deptID = deptID;
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return name + ":" + salary;
	}
	
	void printMaxSalaryEmpDetails(EmployeeClass e1, EmployeeClass e2)
	{
		if(e1.salary>e2.salary)
			System.out.println(e1.toString());
		else	
			System.out.println(e2.toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of the employee1");
		String name1 = sc.next();
		System.out.println("Enter department Id of employee1");
		String id1 = sc.next();
		System.out.println("Enter salary of employee1");
		double sal1 = sc.nextInt();
		System.out.println("Enter Name of the employee2");
		String name2 = sc.next();
		System.out.println("Enter department Id of employee2");
		String id2 = sc.next();
		System.out.println("Enter salary of employee2");
		double sal2 = sc.nextInt();
		EmployeeClass e1 = new EmployeeClass(name1, id1, sal1);
		EmployeeClass e2 = new EmployeeClass(name2, id2, sal2);
		e1.printMaxSalaryEmpDetails(e1, e2);
	}
}


