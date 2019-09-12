package AnupS;
//3)	WAP to find frequency of user defined character in user defined String

import java.util.Scanner;

public class CharacterInString {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word :" );
		String input = sc.nextLine();
		System.out.println("Enter the character :" );
		char ch = sc.next().charAt(0);
		findCharacter (input,ch);
	}
	
	static void findCharacter(String s, char c)
	{
		int x = s.length();
		s = s.toLowerCase().replaceAll(s.valueOf(c), "");
		int y = s.length();
		System.out.println("Occurence of chracter is " + c +  " "+ (x-y));
		
	}
	
	

}
