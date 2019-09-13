package PoojaG.Assignment4.PatternPrinting;

import java.util.Scanner;

public class Question4 {

	static void question4(int n) {
		for(int i=0; i<n; i++){
			
			for(int a = i; a<i; a++){
				System.out.print(" ");
			}
			
			for(int a = n; a>i; a--){
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
		question4(a);
	}
}
