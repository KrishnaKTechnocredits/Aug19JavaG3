class printArray
{
	
	void printNum(int L,int R)
	{
		System.out.println("Numbers from "+ L +"to" +R+" are :");
		for(int i=L;i<=R;i++)
		{
			System.out.print(i);
		}		
		
	}
	public static void main(String a[])
	{
		printArray obj = new printArray();
		obj.printNum(5,8);
	}
}