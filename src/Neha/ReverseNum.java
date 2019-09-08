// Reverse given number
package Neha;

import java.util.Scanner;

public class ReverseNum {
	 static void reverseNum(int number)
	{
		//int number = 456789;
		int x=0;
		int sum=0;
		while(number > 0)
		{
			x = number % 10;
			number = number/10;
			sum=sum * 10 + x;
		}
		System.out.println("Reverse of given number: "+sum);

	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		reverseNum(number);
	}

}
