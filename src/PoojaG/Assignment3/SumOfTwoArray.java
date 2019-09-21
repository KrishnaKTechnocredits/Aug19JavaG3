package PoojaG.Assignment3;

import java.util.Scanner;

public class SumOfTwoArray {

	public static int SumOfTwoArray(int[] a, int[] b, int length1, int length2) { 
	    
		int sum= 0;
		for(int i=0; i<length1; i++) {
			
			sum= sum+a[i];
		}
		for(int i=0; i<length2; i++) {
			
			sum= sum+b[i];
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length1 : ");
		int length1 = sc.nextInt(); 
		System.out.println("Enter Length2 : ");
		int length2 = sc.nextInt();
		int a[]= new int [length1]; 
		int b[]= new int [length2];
		for(int i=0; i<length1; i++){
			a[i]= sc.nextInt();
		}
		for(int i=0; i<length2; i++){
			b[i]= sc.nextInt();
		}
		int result = SumOfTwoArray(a, b, length1, length2);
		
		sc.close();
	    System.out.println(result);

	}


}
