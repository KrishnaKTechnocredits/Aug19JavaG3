package PoojaG.Assignment4.PatternPrinting;

import java.util.Scanner;

public class Question3 {

	static void question3(int n) {
		for(int i=1; i<=n; i++){
			for(int a = n; a>i; a--){
				System.out.print("  ");
			}
			
			for(int j = 1; j<=i; j++){
				System.out.print("* ");
			}	
			
			
		System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int: ");
		int a = sc.nextInt();
		sc.close();
		question3(a);
	}
}
