package PoojaG.Assignment3;

import java.util.Scanner;

public class FindArmstrongNum {

		static int findArmstrongNum(int a){
			
			int x= 0;
			int total = 0;
			while(a != 0){
				x= a % 10;
				a = a/10;
				total= total+(x*x*x);
					
			}
			return total;
					
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//int a= 153;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the number:");
	        int a = s.nextInt();
	        s.close(); 
			int total= findArmstrongNum(a);
			if(a == total){
				System.out.println("This is a Armstrong Number");
				}
				else{
					System.out.println("This is not a Armstrong Number");
				}
		}			
}
