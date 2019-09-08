package ashish;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		for(int i=1;i<=4;i++)
		{	
			for(int j=1;j<=i;j++)
			{
				int v=0;
				if(j<=1)
				{
				System.out.print(i);
				}
				else
				{
					v=i+(j-1)*2;
					System.out.print(" "+v);
				}
				
				}
		System.out.println("\n");
		}
		
		

	}

}
