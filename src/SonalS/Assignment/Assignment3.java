package Assignment;

import java.util.Scanner;

public class Assignment3 {
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter size of Array:");
		int a=sc.nextInt();
		System.out.println("Enter Elements of Array:");
		int arr[]=new int[a];
		for (int i = 0; i < a; i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("The Addition is: " +sum);
		
		
	}

}
