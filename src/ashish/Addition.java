package ashish;

//First Program

public class Addition {

	/**
	 * @paramargs
	 */
	
	public void normal_calculate(int a, int b)
	{
		int sum=0;
		sum=a+b;
		System.out.println("Sum of two numbers using normal method is "+sum);
		
	}
	
	public int return_calculate(int a, int b)
	{
		int sum=0;
		sum=a+b;
		return sum;
				
	}
		
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		int total,x=10,y=22;
		Addition a= new Addition();
		a.normal_calculate(x,y);
		
		total=a.return_calculate(x, y);
		System.out.println("Sum of two numbers using return keyword "+total);
		
	}

}
