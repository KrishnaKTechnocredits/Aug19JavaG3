//WAP to find out maximum length of string from array

package Assignment3;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        String InputArray[]=new String[size];
        System.out.println("Please Enter Elements of array:");
        for (int i = 0; i < size; i++) {
        	InputArray[i]=sc.next();
		}
        PrintMaximumLengthString(InputArray);
	}

	private static void PrintMaximumLengthString(String[] inputArray) {
		// TODO Auto-generated method stub
		int max=0;
		String maxName="";
		for (int i = 0; i < inputArray.length; i++) {
			if(max <inputArray[i].length())
			{
				max=inputArray[i].length();
				maxName=inputArray[i];
			}
		}
		System.out.println("Maximum Length of string from given array:" +maxName);
	}

}
