//WAP to find fibbonacci series for user defined number.
package Assignment3;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prevNumber=0,nextNumber=1, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		for (int i = 0; i <= number; i++) {
			System.out.println(prevNumber);
			sum=prevNumber+nextNumber;
			prevNumber=nextNumber;
			nextNumber=sum;
		}
		
	}

}
