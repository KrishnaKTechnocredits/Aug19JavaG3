//3.Check if array contains a number in java.
package Assignment2;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]={0,1,2,3};
		System.out.println("Enter elements which needs to find:");
		int number=sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==number)
			{
				System.out.println("Number Found ");
			}
			
		}

	}

}
