//WAp to seperate digits and characters from given string.
package Assignment4;

import java.util.Scanner;

public class EX7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.next();
		String number = "";
		String letter = "";
		
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (Character.isDigit(a)) {
				number = number + a;
				continue;
			}
			if (Character.isLetter(a)) {
				letter = letter + a;
			} 
		}
		System.out.println("Characters in string:" + letter);
		System.out.println("Digits in String:" + number);
	}

}
