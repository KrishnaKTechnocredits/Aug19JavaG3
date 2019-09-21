package Aviral;

public class IntegerBtwTwoNum {

	void number(int a,int r)
	{
		for(int i = a;i<=r;i++)
		{
			if(i >= 1 && i <=100 )
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		
			IntegerBtwTwoNum integer = new IntegerBtwTwoNum();
			integer.number(98, 104);
		
	}

}
