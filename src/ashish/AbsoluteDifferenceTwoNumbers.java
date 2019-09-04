package ashish;

//seventh Program

public class AbsoluteDifferenceTwoNumbers {

	/**
	 * @paramargs
	 */
	
	public static void TwoNumberDifference(int a,int b)
	{
		int sum=0;
		sum=b-a;
		System.out.println("Difference of two numbers is "+sum);
		if(sum<0)
		{
			sum=sum*(-1);
			System.out.println("Difference of two numbers is negtaive so multiplied by (-1) number "+sum);
		}
		else
		{
			System.out.println("Difference of two numbers is not negtaive "+sum);
		}
				
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbsoluteDifferenceTwoNumbers a = new AbsoluteDifferenceTwoNumbers();
		a.TwoNumberDifference(25,10);
		
	}

}
