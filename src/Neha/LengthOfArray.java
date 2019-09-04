//Findmax length String from the given array.
package Neha;

import java.util.Scanner;

public class LengthOfArray {
	static void arrayLength(String[] a) {
		//String[] a = { "allthebest", "technocredits", "", "maharashtra" };
		int count = 0;
		String str = "";
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()>count)
			{
				count=a[i].length();
				str = a[i];
			}
		}
		System.out.println("Max length string is "+ str +" & count is "+ count);

//return max;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements for the array: ");
		String[] array = new String[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.next();
			

		}
		arrayLength(array);
		
	}

}
