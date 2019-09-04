//WAP to print common numbers from 2 different array.
package Assignment2;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = { 1, 3, 9, 6, 7 };
		int array2[] = { 1, 2, 9, 6, 3 };
		PrintCommonArray(array1,array2);
		
	}

	private static void PrintCommonArray(int[] array1, int[] array2) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					flag = true;
					System.out.print(array1[i]+" ");
				}

			}
			
		}
		
		if (flag == false) {
			System.out.println("No common elements found");
		}
	}

}
