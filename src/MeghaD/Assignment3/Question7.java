package MeghaD.Assignment3;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i<=5;i++)
		{
			for(int j =2*(5-i);j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
				
			}
			System.out.println(" ");
		}
		for(int i =4; i>=1;i--)
		{
			
			for(int j =2*(4-(i-1));j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
				
			}
			
			System.out.println(" ");
		}
	}

}
