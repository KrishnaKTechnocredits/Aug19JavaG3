package Aviral;

public class PositiveNegativeNumber {
	int positive = 0;
	int negative = 0;
	void numbers()
	{
		int [] arr = {1,2,-9,-44,-33,5,9};
		 
		System.out.print("\n positive number are : ");
		for (int  i = 0; i<arr.length; i++)
		{
			if(arr[i] >0)
			{
				System.out.print(arr[i] + " ");
				positive = positive + arr[i];
		
			}

			else 
			{   
				negative = negative + arr[i];
			}
		}
		
		System.out.println("positive num sum" + positive);
		System.out.println("negative num sum "+ negative);
	}
	
	public static void main(String[] args) {
			PositiveNegativeNumber pn = new PositiveNegativeNumber();
			pn.numbers();
	}

}
