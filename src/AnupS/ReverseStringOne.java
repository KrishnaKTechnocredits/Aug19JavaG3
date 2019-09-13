package AnupS;

import java.util.Scanner;

public class ReverseStringOne {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		reverseStringOne(s1);
	}
	static void reverseStringOne(String s1)
	{
		s1 = s1.replaceAll(" ", "");
		String rev = "";
		for (int i =s1.length()-1;i>=0;i--)
		{
			rev = rev+s1.charAt(i);
		}
		System.out.println("The reverse of the String is " + rev);
	}

}
