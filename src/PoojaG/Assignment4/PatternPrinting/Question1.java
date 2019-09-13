package PoojaG.Assignment4.PatternPrinting;

import java.util.Scanner;

public class Question1 {

	static void question1(int n) {
		for(int i=1; i<=n; i++){
			for(int space=n-i; space>=1; space--){
				
				System.out.print(" ");
			}
			for(int star= 1; star<=i; star++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int: ");
		int a = sc.nextInt();
		sc.close();
		question1(a);
	}

}

