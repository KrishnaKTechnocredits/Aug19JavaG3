//WAP to print even numbers from array.
package Assignment2;

public class Example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int InputArray[]={15,24,52,59,62,10};	
     PrintEvenNumbersFromArray(InputArray);
	}

	private static void PrintEvenNumbersFromArray(int[] inputArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i]%2==0)
			{
				System.out.print(" "+ inputArray[i] + " ");
			}
		}
	}

}
