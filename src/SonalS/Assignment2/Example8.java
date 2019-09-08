//Find first differ index from given array.
package Assignment2;

public class Example8 {

	static void differIndex(int arr1[],int arr2[])
	{
		for(int i=0,j=0;i<arr1.length;i++,j++)
		{
			if(arr1[i]!=arr2[j])
			{
				System.out.println("Values are not matching at index->"+i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 10, 2, 9, 14, 3 };
		int arr2[] = { 10, 2, 18, 14, 3 };
		differIndex(arr1,arr2);
		
	}
}
