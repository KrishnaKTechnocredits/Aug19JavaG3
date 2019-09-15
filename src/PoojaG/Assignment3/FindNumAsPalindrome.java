package PoojaG.Assignment3;

import java.util.Scanner;

public class FindNumAsPalindrome {
	
	static int returnReversNum(int a){
		
		int digit= 0;
		int revnum= 0;
		
		while(a != 0){
			digit = a%10;
			revnum= revnum*10 + digit;
			a= a/10;
			
		}
		 System.out.println(revnum);
		 return revnum;
	}

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = s.nextInt();
        s.close();
        int revnum = returnReversNum(a);
		if(a == revnum){
			System.out.println("This is palindrome");
		}
			else
			System.out.println("This is not palindrome");
			
	}
}
