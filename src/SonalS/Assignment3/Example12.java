// WAP to check whether given number is armstrong or not.
package Assignment3;

import java.util.Scanner;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		int temp=number;
		int sum=0;
		while(number>0)
		{
			int a=number%10;
			number=number/10;
			sum=sum+(a*a*a);
		}
		if(sum==temp)
		{
			System.out.println("Given number is Armstrong number:");
		}
		else
		{
			System.out.println("Given number is not Armstrong number:");
		}
	}

}
