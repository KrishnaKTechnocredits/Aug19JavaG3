package AnupS;

public class Pattern2 {
	
	public static void main(String[] args) {
		int num = 5;
		for(int i=1;i<=num;i++)
		{
			for(int j=0;j<=num-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
