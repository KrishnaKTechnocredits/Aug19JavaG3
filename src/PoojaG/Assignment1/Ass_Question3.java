package PoojaG.Assignment1;

public class Ass_Question3 {

	static void sumOfArrayN(int a[], int length) {
		int sum = 0;
		for (int i = 0; i < length; i++) 
		{

			sum = sum + a[i];
		}
		System.out.println("Sum:" + sum);
	}

	public static void main(String[] args) 
	{
		//int[] a = new int[3];
		int [] a= {3, 6, 8};
		int size= a.length;
		sumOfArrayN(a, size);
	}
}
