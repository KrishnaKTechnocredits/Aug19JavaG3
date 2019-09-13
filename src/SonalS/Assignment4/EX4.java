//WAP to check whether given number is armstrong or not.
package Assignment4;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		CheckArmstrongOrNot(num);

	}

	private static void CheckArmstrongOrNot(int num) {
		// TODO Auto-generated method stub
		int temp = num;
		int sum = 0;
		while (num != 0) {
			int c = num % 10;
			num = num / 10;
			sum = sum + (c * c * c);
		}
		if (temp == sum) {
			System.out.print("Armstrong number");
		} else {
			System.out.print(" Not Armstrong number");
		}
	}

}
