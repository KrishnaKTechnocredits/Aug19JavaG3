package PoojaG.Assignment3;

import java.util.Scanner;

public class PrintReveresNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = s.nextInt();
        s.close();
		int digit= 0;
		int revnum= 0;
		
		while(a != 0){
			digit = a%10;
			revnum= revnum*10 + digit;
			a= a/10;
			
		}
		System.out.println(revnum);
	}

}
