package ashish;


//Fifth  Program

public class LandRPrintIntegerRange {

	/**
	 * @paramargs
	 */
	
	public void PrintNumberRanges(int start,int end)
	{
		int a[]={4,7,2,8,5};
		int sum=0;
		System.out.println("Printing the numbers\n");
			for(int i=start;i<=end;i++)
			{
				System.out.println(i);
			
			}
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LandRPrintIntegerRange a = new LandRPrintIntegerRange();
		a.PrintNumberRanges(5,10);

	}

}
