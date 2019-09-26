package AnupS;

public class Pattern9 {
	public static void main(String[] args) {
		int row = 5;
		int k = 1;
		for (int i = 1; i <= row; i++) 
		{
			if (i < row) 
			{
				for (int j = 1; j <= row - i; j++) 
				{
					System.out.print(" ");
				}

					for (k = 1; k <= i; k++) 
					{
						if(k ==1 || k ==i)
						{
						System.out.print("* ");
						}
						System.out.print("  ");
						
					 }
					System.out.println();
			}
			
			

		else 
			{
				for (int n = 1; n <= (row * 2) - 1; n++) 
				{
					System.out.print("*");
				}
			}
		}
	}
}
	

