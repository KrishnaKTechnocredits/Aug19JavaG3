package PoojaG.Assignment1;

public class Ass_Question2 {
	
	static void sumofarray()
	{
		int sum= 0;
		int[] a ={2, 5, 4, 8, 9};
		
		for (int i = 0; i < a.length; i++)
		{
			sum= sum+a[i];
		}
		System.out.println("Sum:" + sum);
	}
	public static void main(String[] args)
	{
		sumofarray();
	}
}
