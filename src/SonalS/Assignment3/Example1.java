// WAP to calculate positive and negative number sum from given array.
package Assignment3;

import java.util.Scanner;

public class Example1 {

	static void SumPos(int array1[]) {
		int sumPositiveNumber = 0;
	    String cnt = " ";
		for (int j = 0; j < array1.length; j++) {
			if (array1[j] > 0) {
				cnt=cnt+" "+array1[j];
				sumPositiveNumber = sumPositiveNumber + array1[j];

			}

		}
		System.out.println("Positive Numbers are="+cnt );
		System.out.println("Sum of positive Numbers :" + sumPositiveNumber);
	}

	static void SumNeg(int array1[]) {
		int sumNegativeNumber = 0;
		String cnt = " ";
		for (int j = 0; j < array1.length; j++) {
			if (array1[j] < 0) {
				cnt=cnt+" "+array1[j];
				sumNegativeNumber = sumNegativeNumber + array1[j];

			}

		}
		System.out.println("Negative Numbers are="+cnt );
		System.out.println("Sum of Negative Numbers :" + sumNegativeNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int array1[] = new array1[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter size of array:");
		int size=sc.nextInt();
		int array1[] = new int[size];
		System.out.println("Please Enter Elements of array:");
		
		for (int i = 0; i < size; i++) {
			array1[i]=sc.nextInt();
		}
		
		SumPos(array1);
		SumNeg(array1);
	}

}
