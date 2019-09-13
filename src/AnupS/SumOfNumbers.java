package AnupS;
//7) WAP to print sum of digit(Consider Input as Integer not as String)
//Example:-
//input:- 12345
//output:- 15

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sumofNumber(num);
	}
	static void sumofNumber(int a)
	{
		int num = 0;
		int sum = 0;
		while(a>0)
		{
			num=a%10;
			a=a/10;
			sum = sum+num;
		}
		System.out.print(sum);
	}

}
