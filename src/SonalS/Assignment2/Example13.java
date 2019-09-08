//WAP to reverse array

package Assignment2;

public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int InputArray[]={5,6,9,10,14,63};
        printReverseArray(InputArray);
	}

	private static void printReverseArray(int[] inputArray) {
		// TODO Auto-generated method stub
		for (int i=inputArray.length-1;i>=0;i--) {
			System.out.print(inputArray[i] + " ");
			
		}
	}

}
