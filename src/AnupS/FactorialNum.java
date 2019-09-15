package AnupS;
//WAP to print factorial number
//Example:- input:- 5
//output:- 120
//hint:- 1*2*3*4*5=120

import java.util.Scanner;

public class FactorialNum {
	public static void main(String[] args) {
		System.out.println("Enter the number for factorial : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		factorialNum(num);
	}
	static void factorialNum(int a)
	{
		int fact = 1;
		for(int i = a;i>0;i--)
		{
			fact = fact*i;
		}
		System.out.println("The factorial num is :" + fact);
	}
		
}
