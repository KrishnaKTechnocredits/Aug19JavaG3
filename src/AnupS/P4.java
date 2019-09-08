package AnupS;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int size = sc.nextInt();
		for(int i = 0;i<=size;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1)
				{
					System.out.print(i+ " ");
				}
				else
				{
					System.out.print(i+(j-1)*2 + " ");
				}
			}
			System.out.println(" ");
		}
	}

}
