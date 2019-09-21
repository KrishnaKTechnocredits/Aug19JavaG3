package Aviral;



public class ArrayNumber {
	
	void num(String str,int number)
	{     int count = 0;
		int[] check =  {1,2,3,4,7,9,5};
		for(int i = 0 ; i<check.length; i++)
		{
			if(check[i] == number)
			{
				System.out.println("yes the number is present");
				count++;
			}
		}if(count ==0)
		{
			System.out.println("not present");
		}
	}
	public static void main(String[] args)
	{
		ArrayNumber arr = new ArrayNumber();
		arr.num("ganni",555);
	}

}
