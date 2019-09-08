package Assignment;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter L size");
        int L=sc.nextInt();
        System.out.println("Enter R size");
        int R=sc.nextInt();
        for (int i = L; i <= R; i++) {
        	
        	System.out.println("" +i);
        }
        sc.close();
		}
        
}
