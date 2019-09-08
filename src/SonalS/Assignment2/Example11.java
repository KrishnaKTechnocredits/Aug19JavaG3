//WAP to print unique number from array.
package Assignment2;

public class Example11 {
	static int[] getUniqueArray() {
		int[] num1 = { 10, 13, 11, 19, 0, 13 };
		int[] num2 = { 18, 11, 10, 29, 11 };
		int[] outArray = new int[num1.length + num2.length]; // not depend on size of array1 and array2 hence declare new variable for that.
		int index = 0;
		// check every element from array 1 if it present in final array then
		// don't put it otherwise put it.
		for (int i = 0; i < num1.length; i++) {
			boolean flag = false;
			for (int j = 0; j < index; j++) {
				if (num1[i] == outArray[j]) {
					flag = true; // if element is present in final array then  make flag true.
					break;
				}

			}
			if (flag == false) {
				outArray[index] = num1[i]; // if element is not present in final array mark it as false
				index++;
			}

		}
		for (int i = 0; i < index; i++) {
			//if (outArray[i] != 0)
				System.out.println(outArray[i]);
		}
		
		//-------------------------------------------------------------------------
		
		for (int i = 0; i < num2.length; i++) {
			boolean flag = false;
			for (int j = 0; j < index; j++) {
				if (num2[i] == outArray[j]) {
					flag = true; // if element is present in final array the make flag true.
					break;
				}

			}
			if (flag == false) {
				outArray[index] = num2[i]; // if element is not present in final
											// array mark it as false
				index++;
			}

		}
		for (int i = 0; i < index; i++) {
			//if (outArray[i] != 0)
				System.out.println(outArray[i]);
		}
		
		return outArray;
						
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x=getUniqueArray();
	}

}
