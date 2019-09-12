package AnupS;
//2)	WAP to find max length String from the given array.

import java.util.Scanner;

public class MaxLengthString {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of words :");
		int size = sc.nextInt();
		String[] str = new String[size];
		for(int i = 0;i< size;i++)
		{
			System.out.println("Enter the word :" +(i+1));
			str [i]= sc.next();
		}
		findMaxLength(str);
	}
	static void findMaxLength(String[] a)
	{
		int maxlength = 0;
		String maxstr = null;
		for(int i =0;i< a.length;i++)
		{
			if(a[i].length()>maxlength)
			{
				maxlength = a[i].length();
				maxstr = a[i];
			}
			else
			{
				maxlength = a[i].length();
				maxstr = a[i];
			}
		}
		System.out.println("The maximum lenth word is " + maxstr + "The length of the word is " +maxlength);
	}

}
