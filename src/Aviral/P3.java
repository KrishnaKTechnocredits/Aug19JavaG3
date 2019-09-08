package Aviral;

public class P3 {

		public static void main(String[] args) {
			
			int a = 0;
			
			for(int i = 1; i<=4; i++)
			{
				for(int j =1 ; j<=i; j++)
				{
					if(j == 1)
					{
					System.out.print(i);
				}
					
					else 
					{    a = a +i; 
						System.out.print(a + 2 - j);
					}
					/*if(j>=2 && j<3)
					{
						System.out.print(i + 2);
						
					}
					if(j >= 3)
					{ 
						System.out.print(i + 4);
					}
					if(j > = 4)
	*/					
				}
		}

			

	}
		


}
