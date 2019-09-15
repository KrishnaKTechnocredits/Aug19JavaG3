package PoojaG.Assignment3;

import java.util.Scanner;

public class FindWordPalindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		sc.close();
		String reveres= "";
		for(int i = str.length()-1; i>=0; i--){
			
			reveres= reveres + (str.charAt(i));
			
		}
		System.out.println(reveres);
		if(str.equalsIgnoreCase(reveres)){
			System.out.println("This is palindrome");
		}
			else
			System.out.println("This is not palindrome");
			
	}

}
