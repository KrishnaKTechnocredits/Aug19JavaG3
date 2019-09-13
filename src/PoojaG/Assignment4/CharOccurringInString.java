package PoojaG.Assignment4;

import java.util.Scanner;

public class CharOccurringInString {
		
		static void charOccurringInString(String a, char b){
			 int count= 0;
			for(int i=0; i<a.length(); i++){
					if(a.charAt(i) == b)
					count++;
					
			}
			System.out.println("char is " + b + " and number of occurrence " + count);
		}
												
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String: ");
			String a = sc.nextLine();
			System.out.println("Enter Char: ");
			char ch = sc.next().charAt(0);
			charOccurringInString(a, ch);
		}

}
