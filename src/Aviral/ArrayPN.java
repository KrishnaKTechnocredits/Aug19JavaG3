package Aviral;

public class ArrayPN
{
	static int positivenum = 0;
	 static int negativenum = 0;
	 
	 static int  num1 = 0;
	 static int  num2 = 0;
	 
	 static boolean flag = false;

	static void number()
	{
		int[] num = { -1,-2,-1,33, 3, 4, -5 , 6};
		{
			for(int i=0;i<num.length;i++)
	        {
	        
				if(num[i] >= 0)
				{  
					//System.out.println("positive = " + positivenum);
					//System.out.println("positive number  = " + num[i]);
					num1++;
					positivenum = positivenum + num[i];
					
				}
				
				
				else 
				{
					negativenum =  negativenum + num[i];
					num2++;
					
				}
				
				//System.out.println("positive numbers  = " + num[i]);
			}
			System.out.println("positive number  = " + num1);
			System.out.println("positive number  = " + num2);
			System.out.println("positive sum  = " + positivenum);
			System.out.println("negativenum = " + negativenum);
				
		}
		
	}
	

	
public static void main(String[] args) {
	ArrayPN.number();
}

}
