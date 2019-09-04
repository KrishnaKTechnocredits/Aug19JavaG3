package AnupS;

//Write a java program to check the equality of two arrays?

public class AssignmentSix {

	static void equalArr() {
		int count = 0;
		int array1[] = { 21, 57, 11, 37, 24 };
		int array2[] = { 21, 57, 11, 37, 24 };

		for (int i = 0; i < array1.length; i++) {
			// boolean flag=true;

			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					// flag=false;
					count++;
				}
			}

		}
		if (count == array1.length) {
			System.out.println("two arrays are equal");
		} else {
			System.out.println("two arrays are not equal");
		}
	}

	public static void main(String[] args) {
		equalArr();

	}

}
