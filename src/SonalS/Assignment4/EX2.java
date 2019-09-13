//WAP 

package Assignment4;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.print(" "+num1);
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			
		}
	}

}
