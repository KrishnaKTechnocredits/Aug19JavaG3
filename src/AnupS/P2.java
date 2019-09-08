package AnupS;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int size = sc.nextInt();
		for(int i = 0;i<=size;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println(" ");
		}
	}

}
