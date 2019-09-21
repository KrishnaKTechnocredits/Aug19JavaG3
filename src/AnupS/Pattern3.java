package AnupS;

public class Pattern3 {
	
	public static void main(String[] args) {
		int num = 5;
		for (int i = 1;i<=num;i++)
		{
			for(int j=1;j<=num-i;j++)
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
