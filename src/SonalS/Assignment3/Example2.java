//WAP to find out the frequency of user defined characters in user defined string.


package Assignment3;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String input=sc.next();
        //char ch[]=input.toCharArray();
        int count=0;
        System.out.println("Enter the character that needs to find from given string:");
         
        char ch1=sc.next().charAt(0);
        for (int i = 0; i < input.length(); i++) {
			if(ch1==input.charAt(i))
			{
				count++;
			}
		}
        System.out.println("Count of "+ch1 + ":" +count);
	}

}

