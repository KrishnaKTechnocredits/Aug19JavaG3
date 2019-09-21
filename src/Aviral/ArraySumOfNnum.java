package Aviral;

public class ArraySumOfNnum {
	int sum1 = 0;
	void sum()
	{
		int [] arr = { 1,25,500,6,32,5,2,5,150};
		
		for (int i = 0 ; i<arr.length;i++)
		{
			if(arr[i] >= 1 && arr[i] <=100 )
			{
				sum1 += arr[i];
			}
		}  System.out.println(sum1);
	}
	
	
	public static void main(String[] args) {
		ArraySumOfNnum a = new ArraySumOfNnum();
		a.sum();
      // sum of array is 76 only 
	
	}
}
