package Assignment;

import java.util.Scanner;


public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0,pow=0;
		System.out.println("Enter size of Array:");
		int a=sc.nextInt();
		System.out.println("Enter Elements of Array:");
		int arr[]=new int[a];
		for (int i = 0; i < a; i++) {
			arr[i]=sc.nextInt();
			//pow=arr[i]*arr[i];
			pow=(int) Math.pow(arr[i], 2);
			sum=sum+pow;
			
		}
		System.out.println("The Addition is: " +sum);
	
	}

}
