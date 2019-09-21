//WAP to print factorial of given number
package Assignment4;

import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		printFactNum(num);
	}

	private static void printFactNum(int num) {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=1;i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of number is:"+fact); 
}
}
