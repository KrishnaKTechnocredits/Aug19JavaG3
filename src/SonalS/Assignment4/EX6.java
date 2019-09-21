//WAP to print sum of digits
package Assignment4;

import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		PrintSumDigits(num);

	}

	private static void PrintSumDigits(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num1 = 0;
		while (num > 0) {
			num1 = num % 10;
			num = num / 10;
			sum = sum + num1;

		}
		System.out.println("Sum of given number:"+sum);
	}

}
