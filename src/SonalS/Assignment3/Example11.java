package Assignment3;

import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String name = sc.next();
		String temp = "";
		 char ch[]=name.toCharArray();
		for (int i =ch.length- 1; i >= 0; i--) {
			
			temp=temp+ch[i];
    
		}
		System.out.println(temp);
		//System.out.println(name);
		if (name.equals(temp)) {
			System.out.println("Given string is palindrome");

		} else {
			System.out.println("Given string is not palindrome ");
		}
	}

}
