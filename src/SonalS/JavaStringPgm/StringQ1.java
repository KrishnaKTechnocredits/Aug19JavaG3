// Print the string between first i occurance to end and print number of occurences of char 'a' in given string.
package JavaStringPgm;

import java.util.Scanner;

public class StringQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input:");
		String input=sc.nextLine();
		//String input = "This is how you leArn java-selenium";

		int FirstIndex = input.indexOf('i');
		int LastIndex = input.lastIndexOf('i');
		String ans = input.substring(FirstIndex, LastIndex);
		System.out.println("Ans:" + ans);
        System.out.println("-----------------------------------------------------------");
		
		// Print occurences of char'a' in given string 
        /* Using For loop
         * int count=0;
		for (int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i)=='a' || input.charAt(i)=='A')
			{
				count++;
			}
		}
		System.out.println("freq of a/A:" + count);*/
		
		// using string functions
        int startLen=input.length();
		//System.out.println(startLen);
		int endLen=input.replaceAll("a", "").replaceAll("A", "").length();
		//System.out.println(endLen);
		System.out.println(startLen - endLen);
		
	}

}
