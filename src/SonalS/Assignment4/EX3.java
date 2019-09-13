// WAP to reverse  given number
package Assignment4;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		while(number!=0) {
			rev=rev*10;
			rev = rev + number % 10;
			number=number/10;
		}
		System.out.print(rev);
	}

}
