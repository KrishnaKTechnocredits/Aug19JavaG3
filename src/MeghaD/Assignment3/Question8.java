package MeghaD.Assignment3;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=(i+1);j<=5;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println(" ");
		}
		for(int i=4;i>=1;i--)
		{
			
			for(int j=0;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
