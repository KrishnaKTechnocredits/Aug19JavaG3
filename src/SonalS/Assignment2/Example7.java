//WAP to print all pairs of integer array whose sum is equal to given number.
package Assignment2;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int InputArray[]={2,4,3,5,7,8,9};
      int sum=7;
      printSum(InputArray,sum);
	}

	private static void printSum(int[] inputArray, int sum) {
		// TODO Auto-generated method stub
		int addition=0;
		for (int i = 0; i < inputArray.length; i++) {
			for (int j =i+1; j < inputArray.length; j++) {
				addition=inputArray[i]+inputArray[j];
				if(addition==sum)
				{
					System.out.print(" "+ inputArray[i] +"+"+ inputArray[j]+"="+addition);
				}
			}
		}
	}

}
