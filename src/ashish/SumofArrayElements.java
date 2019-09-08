package ashish;

import java.util.Scanner;

//Third Program


public class SumofArrayElements 
{

	/**
	 * @paramargs
	 */
	
	public void DynamicArraySum()
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements in array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements in an array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		
		System.out.println("Printing array elements are\n");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		
		}
		
		int sum=0;
		System.out.println("Printing sum of array elements are\n");
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		
		}
		System.out.println("Sum of array elements is "+sum);
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		SumofArrayElements a = new SumofArrayElements();
		a.DynamicArraySum();
		
	}

}
