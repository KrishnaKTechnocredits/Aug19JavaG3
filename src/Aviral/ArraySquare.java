package Aviral;

public class ArraySquare {
	
	int square = 0;
	void squaree()
	{
		int [] arr = { 1,2,500,150};
		
		for (int i = 0 ; i<arr.length;i++)
		{
			if(arr[i] >= 1 && arr[i] <=100 )
				
			{     
				square += arr[i]*arr[i];
				
			}
		}  System.out.println(square);
	}
	
	
	public static void main(String[] args) {
		ArraySquare a = new ArraySquare();
		a.squaree();
      // sum of array is 5 only 
	
	}

}
