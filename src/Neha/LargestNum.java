//Find the largest of three numbers using Logical And operator.
package Neha;

import java.util.Scanner;

public class LargestNum {
	static void largestNum(int x, int y, int z) {
		if (x > y && x > z)
			System.out.println(x + " is largest");
		else if (y > x && y > z)
			System.out.println(y + " is largest");
		else if (z > x && z > y)
			System.out.println(z + " is largest");
		else
			System.out.println("Entered numbers are not distinct.");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1");
		int x = sc.nextInt();
		System.out.println("Enter the number2");
		int y = sc.nextInt();
		System.out.println("Enter the number3");
		int z = sc.nextInt();
		largestNum(x, y, z);
	}

}
