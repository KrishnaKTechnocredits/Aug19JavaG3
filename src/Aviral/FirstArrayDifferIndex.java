package Aviral;

import java.nio.charset.MalformedInputException;

public class FirstArrayDifferIndex {

	void missingindex() {
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 3, 4 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
				if (a[i] == b[i])
				{
					count++;
					

				} 	
				else 
				{
					System.out.println("array are not equals at  "+ i + " index");
				
				}

			}

		}

	
	public static void main(String[] args) {
		FirstArrayDifferIndex first = new FirstArrayDifferIndex();
		first.missingindex();
		
	}

}
