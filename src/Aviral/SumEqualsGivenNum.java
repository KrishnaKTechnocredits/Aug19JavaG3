package Aviral;

public class SumEqualsGivenNum {
	
	void number (int n)
	{
		int [] arr = { 1,2,4,5,6,7,0};
		for (int i = 0; i<arr.length ;i++)
		{
			for(int j = 0; j<arr.length; j++)
			{
				if (arr[i] + arr[j] == n)
				{
					System.out.println(arr[i] + "and" + arr[j]);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		SumEqualsGivenNum num = new SumEqualsGivenNum();
		num.number(8);
	}

}
