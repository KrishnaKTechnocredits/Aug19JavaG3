package AnupS;

import java.util.Scanner;

//7)	WAP to find factorial for user defined number
public class FactorialOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		factorialNum(num);
	}
	static void factorialNum(int x)
	{
		int fact = 1;
		for(int i = x;i>=1;i--)
		{ 
			fact=fact*i;
		}
		System.out.println("The Factorial of " + x + " is " + fact );
	}

}
