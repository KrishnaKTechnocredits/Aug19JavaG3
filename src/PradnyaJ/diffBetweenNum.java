class diffBetweenNum
{
	
	void diffNum(int i,int j)
	{
		int diff = i-j;
		if(diff <0)
			diff=diff*-1;
		System.out.println("difference between the numbers is :"+ diff);
		
	}
	public static void main(String a[])
	{
		diffBetweenNum diff1 = new diffBetweenNum();
		diff1.diffNum(30,5);
		
		
	}
	
}