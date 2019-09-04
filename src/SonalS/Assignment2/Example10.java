//WAP to print max value from Array.
package Assignment2;

public class Example10 {
	
	static void printMaxValFromArray(int arr1[],int  arr2[])
	{
		for(int i=0,j=0;i<arr1.length;i++,j++)
		{
			if(arr1[i]!=arr2[j])
			{
				System.out.println("Values are not matching at index->" + i);
			}
			if(arr1[i]>arr2[j])
			{
				System.out.println("Max value From (" +arr1[i] + ","+arr2[j]+")" + "is" + arr1[i]);
			}
			else if(arr1[i]<arr2[j])
			{
				System.out.println(" Max value From (" +arr1[i] + ","+arr2[j]+")"+ "is" + arr2[j]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 10, 2, 9, 14, 3 };
		int arr2[] = { 10, 2, 18, 14, 13 };
		printMaxValFromArray(arr1,arr2);
		
	}

}
