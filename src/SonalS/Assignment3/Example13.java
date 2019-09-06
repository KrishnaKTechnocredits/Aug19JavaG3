//WAP to print the string from given array if it has length more than 7.
package Assignment3;

import java.util.Scanner;

public class Example13 {

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
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i].length()>7)
			{
				 System.out.println(inputArray[i]);
			}
		}
	}

}
