package Assignment4;

import java.util.Arrays;

public class EX10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str[]={"dfdfd","fdfd","fdfdf","101","123"};
    String str1=Arrays.toString(str);
    
    String number="";
    String letter="";
    for (int i = 0; i < str1.length(); i++) {
    	char ch=str1.charAt(i);
		if(Character.isDigit(ch))
		{
			number=number+ch;
			continue;
		}
		if(Character.isLetter(ch))
	    {
			
			letter=letter+ch;
			continue;
	    }
	}
    System.out.println("String -> " + letter);
	System.out.println("Numeric -> " +number);
	}

}
