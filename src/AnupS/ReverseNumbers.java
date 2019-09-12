package AnupS;
//5)	WAP to reveres user given number

import java.util.Scanner;

public class ReverseNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int size = sc.nextInt();
		reverseNum(size);
	}
	static void reverseNum(int x)
	{
		String s = null;
		s = s.valueOf(x);
		System.out.println("The reverse number is ");
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch = s.charAt(i);
			String temp = s.valueOf(ch);
			int y = Integer.parseInt(temp);
			System.out.print(y +" ");
		}
		
	}

}
