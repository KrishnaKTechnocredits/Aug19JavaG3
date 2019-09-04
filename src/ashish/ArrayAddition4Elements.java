package ashish;


//Second  Program

public class ArrayAddition4Elements {

	/**
	 * @paramargs
	 */
	public static void ArrayAddition()
	{
		int a[]={1,2,3,4};
		int sum=0;
		
			for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i];
			
			}
		
			System.out.println("Sum of elements in array is "+sum);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayAddition4Elements a = new ArrayAddition4Elements();
		//a.ArrayAddition();
		ArrayAddition();

	}

}

