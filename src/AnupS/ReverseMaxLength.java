package AnupS;

import java.util.Scanner;

//6)	WAP to find reverse max length string 
public class ReverseMaxLength {
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
		revMaxLength(str);
	}
	static void revMaxLength(String[] s)
	{
		int maxlength = 0;
		String str = null;
		
		for (int i =0;i<s.length;i++)
		{
			if(s[i].length()>maxlength)
			{
				maxlength = s[i].length();
				str = s[i];
			}
			else
			{
				maxlength = maxlength;
				str = str;
			}
		}
		System.out.println(str + " " + maxlength);
		char[] ch = str.toCharArray();
		for(int i = str.length()-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
}
