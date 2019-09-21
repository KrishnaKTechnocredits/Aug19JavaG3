package PoojaG.Assignment1;

public class SumOfSquareArray {

	static void squareOfArray (int a[], int length) {
		int sum = 0;
		for (int i = 0; i < length; i++) 
		{

			sum = sum + (a[i]*a[i]);
		}
		System.out.println("Sum:" + sum);
	}

	public static void main(String[] args) 
	{
		//int[] a = new int[3];
		int [] a= {4, 7, 2, 8, 5};
		int size= a.length;
		squareOfArray(a, size);
	}
}
