//WAP to reverse a full string and particular word also.
package Assignment4;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String InputString=sc.nextLine();
		PrintReverseString(InputString);
		
	}

	private static void PrintReverseString(String inputString) {
		// TODO Auto-generated method stub

        String str1=inputString.replaceAll(" ","");
		//System.out.println(str1);
		char ch[] = str1.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		
	}

}
