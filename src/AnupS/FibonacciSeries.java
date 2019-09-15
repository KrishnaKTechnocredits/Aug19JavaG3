package AnupS;

import java.util.Scanner;

//WAP to print Fibonacci series up to user required.
public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter the number up to which Fibonacci series required : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		fibonacciSeries(num);
		
	}
    static void fibonacciSeries(int n)
    {
    	int i1 = 0;
		int i2 = 1;
		int fnum = 0;
		System.out.print(i1+ " " +i2);
    	for(int i=2;i<n;i++)
    	{
    		fnum = i1+i2;
    		//System.out.print(i1 + " "+ i2);
    		i1 = i2;
    		i2 = fnum;
    		System.out.print(" "+ fnum);
    	}
    	
    }
}
