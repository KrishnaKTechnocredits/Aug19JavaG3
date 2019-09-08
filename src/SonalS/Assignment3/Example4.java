//WAP to find sum of given number

package Assignment3;

import java.util.Scanner;

public class Example4 {
	
	public void PrintUserInputNumberSum()
	{
		int sum=0;
	      System.out.println("Enter number:");
	      Scanner sc=new Scanner(System.in);
	      int number=sc.nextInt();
	       while(number>0)
	       {
	    	   int r =number%10;
	    	   sum=sum+r;
	    	   number=number/10;
	    	   
	       }
	       System.out.println("The sum of given number:" +sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example4 e4=new Example4();
		e4.PrintUserInputNumberSum();
	}
	
	

}
