package ashish;


//Sixth Program

public class TwoArraysAddition {

	/**
	 * @paramargs
	 */
	
	public static void ArrayAddition()
	{
		int a[]={1,22,3,44};
		int b[]={1,2,10,4};
		int sum[]=new int[5];
		
			for(int i=0;i<a.length;i++)
			{
				sum[i]=a[i]+b[i];
				System.out.println("Sum of "+i+"th element from both array is "+sum[i]);
					
			}
				
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoArraysAddition a = new TwoArraysAddition();
		//a.ArrayAddition();
		ArrayAddition();

		
	}

}
