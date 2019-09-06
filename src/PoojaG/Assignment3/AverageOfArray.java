package PoojaG.Assignment3;

import java.util.Scanner;

public class AverageOfArray {
	
	static int averageOfArray(int a[]){
		int result=0;
		for(int i=0; i<a.length; i++){
			result= result+a[i];		
			}
			result= result/a.length;
			return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt(); // defining the length of array
		int a[]= new int [length]; // passing length in array
		//int[] input= {14, 32, 19, 14, 78,36};
		for(int i=0; i<a.length; i++){
			a[i]= sc.nextInt();
		}
		int result = averageOfArray(a);
		
		sc.close();
		System.out.println(result);
	}

}
