//WAP to find the number of vowels in given string.
package Assignment3;

import java.util.Scanner;

public class Example8 {

	public static void PrintVowelCount(String input)
	{
		int count=0;
		//String temp[]=input.split(" ");
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='0'||input.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("Total Numbers of vowels in given string: " +count);
		/*char ch[]=input.toCharArray();
		int vowelCount=0;
		for (int i = 0; i < ch.length; i++) {
			 
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				vowelCount++;
			}
		}
		System.out.println("Total Numbers of vowels in given string: " +vowelCount);*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		String str1=str.replaceAll("\\s", "");
		PrintVowelCount(str1);
	}

}
