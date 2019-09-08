package Assignment;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[]=new int[4];
		//int arr1[]=new int[4];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size for Array1");
		int size=sc.nextInt();
		System.out.println("Enter elements for Array1");
		int arr[]=new int[size];
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter size for Array2");
		int size1=sc.nextInt();
		System.out.println("Enter elements for Array2");
		int arr1[]=new int[size1];
		for (int i = 0; i < size1; i++) {
			arr1[i]=sc.nextInt();
			
		}
		int arr2[]=new int[4];
		for (int i = 0; i < size1; i++) {
			
			arr2[i]=arr[i]+arr1[i];
			System.out.print(":" +arr2[i]);
		}
		
	}

}
