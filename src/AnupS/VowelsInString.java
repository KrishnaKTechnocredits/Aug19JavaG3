package AnupS;

import java.util.Scanner;

//8)	WAP to find vowels in given string
public class VowelsInString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word :" );
		String input = sc.nextLine();
		findVowelsinString(input);
	}

	static void findVowelsinString(String input) 
	{
	int prelen = input.length();
	input = input.replaceAll("a", "").replaceAll("A", "").replaceAll("e", "").replaceAll("E", "").replaceAll("i", "").replaceAll("I", "").replaceAll("o", "").replaceAll("O", "").replaceAll("u", "").replaceAll("U", "");
	int postlen = input.length();
	System.out.println("The No of vowels in the string is "+ (prelen-postlen));
	}

}
