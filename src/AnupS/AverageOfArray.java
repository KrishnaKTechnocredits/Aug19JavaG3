package AnupS;

import java.util.Scanner;

//9)	WAP to find average of user given array
public class AverageOfArray 
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
		averageOfArray(input);
	
	}

	static void averageOfArray(int[] input) 
	{
		float avg = 0;
		float sum = 0;
	    for(int i = 0;i<input.length;i++)
	    {
		sum = sum+input[i];
	    }
	    avg = sum/input.length;
	    System.out.println("The average of the Array is " + avg);
		
	}
	
}
