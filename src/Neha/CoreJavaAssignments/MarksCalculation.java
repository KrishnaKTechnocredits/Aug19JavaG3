/* WAP to input student marks by condition :
Marks is greater than 0 and less than 50--FAIILED 
Marks is greater than 50 and less than 75--1st Class 
Marks greater than 75 –and less than 100 Distinction*/

package Neha.CoreJavaAssignments;

import java.util.Scanner;

public class MarksCalculation {
	static void grade(int marks) {
		if (marks < 50)
			System.out.println("Failed");
		else if (marks < 75)
			System.out.println("First Class");
		else if (marks < 100)
			System.out.println("Distinction");
		else
			System.out.println("Grades cannot exceed 100");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your grades");
		int marks = sc.nextInt();
		grade(marks);
	}

}
