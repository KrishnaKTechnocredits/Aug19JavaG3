package AnupS;

import java.util.Scanner;

//1)	WAP which fulfill below condition
//a.	WAP to find positive and negative number from the given array  
//b.	check the sum of individual.

public class QuestionOne 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		int[] input = new int[size];
		for(int i = 0;i<size;i++)
		{
			System.out.println("Enter the number :" +(i+1));
			input [i]= sc.nextInt();
		}
		arraySum(input);
	}
	
	static void arraySum(int[] a)
	{
		//int[] input= {5, 6, -9, 14, -25, 6, 7, -14};
		int psum = 0;	
		int nsum = 0;
		int i;
		for(i=0;i<a.length;i++)
		{
			if(a[i] > 0)
			{
				psum = psum+a[i];
				System.out.println ("The positive Values are " + a[i]);
			}
			else if(a[i]< 0 && a[i]!=0)
			{
				nsum = nsum+a[i];
				System.out.println ("The Negative Values are " + a[i]);
			}	
		}
		System.out.println("Positive array Sum is "+ psum +" and " + "Negative values sum is" +nsum );
	}

}
