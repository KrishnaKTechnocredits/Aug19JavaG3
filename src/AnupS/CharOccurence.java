package AnupS;
//10) WAP to character occurring in user defined String and Character
//Example :-
//InputString :- hello how are you harsh?
//Input char :- h
//Output:- char is : h and number of occurrence = 4.

import java.util.Scanner;

public class CharOccurence {
	public static void main(String[] args) {
		System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Enter the character :");
		char ch = sc.next().charAt(0);
		findCharOccu(s,ch);
	}
	static void findCharOccu(String s1, char ch)
	{
		int count = 0;
		for(int i =0;i<s1.length();i++)
		{
			if(s1.charAt(i) ==ch)
				{
					count++;
	
				}
		}
		System.out.println("The number of occurence of " + ch + " is "+ count);
	}

}
