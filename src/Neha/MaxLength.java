package Neha;

import java.util.Scanner;

public class MaxLength {
	static void maxlength(String[] str)
	{
		//String[] arr = {"krishna","maulik","aakash","harsh","aakansha", "abhishek"};
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()>=7)
			{
				System.out.print("The names are: "+str[i]+" ");
			}
		}
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

		maxlength(array);
	}

}
