package PoojaG.Assignment4;

import java.util.Scanner;

public class FindStringPalidrom {
	
	static String findStringPalidrom(String a){
		String rev= "";
		for(int i= a.length()-1; i>=0; i--){
			rev = rev + a.charAt(i);
		}
		
		return rev;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = sc.nextLine();
		String rev= findStringPalidrom(a);
		if(rev.equals(a)){
			System.out.println("This is Palidrom String");
		}
		else
			System.out.println("This is not Palidrom String");
	}

}
