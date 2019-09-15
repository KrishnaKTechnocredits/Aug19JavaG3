package AnupS;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println("Enter the number of word to be reversed ");
		int num = sc.nextInt();
		reverseString(s1);
		reverseWord(s1,num);
	}
	static void reverseString(String s1)
	{
		s1 = s1.replaceAll(" ", "");
		System.out.println(s1);
		String rev = "";
		for (int i =s1.length()-1;i>=0;i--)
		{
			rev = rev+s1.charAt(i);
		}
		System.out.println("The reverse of the String is " + rev);
	}
	static void reverseWord(String s1, int num)
	{
		String[] s2 = s1.split(" ");;
		String revword = "";
		for(int j = s2[num].length()-1;j>=0;j--)
		{
			revword = revword +s2[num].charAt(j);
		}
		System.out.println("The reverse of the word is " + revword);
	}

}
