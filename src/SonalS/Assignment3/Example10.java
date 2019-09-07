//WAP to check whether given number is palindrome or not.

package Assignment3;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		int temp=number;
		int rev=0;
		while (number!=0) {
			rev = rev * 10;
			rev = rev + number % 10;
			number = number / 10;
		}
        if(temp==rev)
        {
        	System.out.println("The number is palindrome");
        }
        else
        {
        	System.out.println("The number is not palindrome");
        }
	}

}
