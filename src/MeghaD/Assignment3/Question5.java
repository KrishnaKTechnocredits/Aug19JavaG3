package MeghaD.Assignment3;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--)
		{
			
			for(int j=1;j<=5-i;j++)
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
