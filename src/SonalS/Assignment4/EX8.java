//WAP to character occuring in string.
package Assignment4;

import java.util.Scanner;

public class EX8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		System.out.println("Enter the Character needs to search from string:");
		char ch=sc.next().charAt(0);
		int cnt=0;
		for (int i = 0; i < str.length(); i++) {
			if(ch==str.charAt(i))
			{
				cnt++;
			}
		}
		System.out.println("Char is :"+ ch + " And the number of occurences=" +cnt);
	}

}
