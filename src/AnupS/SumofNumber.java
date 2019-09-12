package AnupS;

import java.util.Scanner;

//4)	WAP to find sum of user given number.
public class SumofNumber {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int size = sc.nextInt();
		digitSum(size);
		int totalSum = digitSum(size);
		System.out.println(digitSum(size));
	}
	static int digitSum(int i)
	{
		int y,sum = 0;
		while(i>0)
		{
			y = i % 10;
			i = i/10;
			sum = sum+y;
		}
		return sum;
	}
}