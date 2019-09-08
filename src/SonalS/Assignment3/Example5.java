//WAP to reverse given number.
package Assignment3;

import java.util.Scanner;

public class Example5 {

	public void PrintReverseNumber() {
		int rev = 0;
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while (number != 0) {
			rev = rev * 10;
			rev = rev + number % 10;
			number = number / 10;
		}
		System.out.println("The sum of given number:" + rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example5 e5 = new Example5();
		e5.PrintReverseNumber();
	}

}
