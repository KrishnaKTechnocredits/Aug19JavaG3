// number is armstrong or not
package Neha;

import java.util.Scanner;

public class Armstrongnum {
	static void armstrong(int num) {
		// int num = 153;
		int sum = 0;
		int x = 0;
		int num1 = 0;
		num1 = num;
		while (num > 0) {
			x = num % 10;
			num = num / 10;
			sum = sum + (x * x * x);

		}
		if (num1 == sum)
			System.out.println("The number is armstrong");
		else
			System.out.println("The number is not armstrong");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		armstrong(number);
	}

}
