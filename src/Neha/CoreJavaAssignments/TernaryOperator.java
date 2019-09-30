// 2. Find greater of two numbers using ternary operator.
package Neha.CoreJavaAssignments;

import java.util.Scanner;

public class TernaryOperator {
	static void largestOfTwo(int num1, int num2) {
		int max = (num1 > num2) ? num1 : num2;
		System.out.println("The greater of two number is: " + max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1");
		int x = sc.nextInt();
		System.out.println("Enter the number2");
		int y = sc.nextInt();
		largestOfTwo(x, y);
	}
}
