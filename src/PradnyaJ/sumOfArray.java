class sumOfArray
{
	int arr[]={4,8,9,7};
	int sum=0;a
	void sumArray()
	{
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}		
		System.out.println("Sum of Array is "+sum);
	}
	public static void main(String a[])
	{
		sumOfArray s1 = new sumOfArray();
		s1.sumArray();
	}
}