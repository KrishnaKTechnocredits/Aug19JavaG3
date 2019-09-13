package AnupS;
//WAP to revers number (Consider Input as Integer not as String).
//Example:-
//input:- 12345
//output:- 54321

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		reverseNumber(num);
	}
	static void reverseNumber(int a)
	{
		int num = 0;
		while(a>0)
		{
			num=a%10;
			a=a/10;
			System.out.print(num);
		}
	}
}
