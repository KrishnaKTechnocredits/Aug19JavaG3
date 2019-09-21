package Aviral;

public class SecondLargestNum {
   
	 int largest = 0;
	 int secondlargest = 0;
	   int [] arr = {  1,4,6,21,22,3};
	   void num()
	   {
		   for(int i = 0 ; i<arr.length;i++)
		   {
			     if(arr[i] > largest)
			     {
			    	 secondlargest = largest;
			    	 largest = arr[i];
			   }
		   }
		   System.out.println("second largest num   " +secondlargest);
	   }
	   
	   public static void main(String[] args) {
		   SecondLargestNum sec = new SecondLargestNum();
		   sec.num();
	}
}
