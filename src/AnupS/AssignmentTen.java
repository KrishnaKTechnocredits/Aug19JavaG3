package AnupS;

//Find max value at differed index 
public class AssignmentTen {
	static void printMaxIndex() {
		int arr1[] = { 10, 2, 18, 14, 8 };
		int arr2[] = { 10, 2, 9, 14, 8 };

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				System.out.println(" Values are not matching at index   : " + i);
				if (arr1[i] > arr2[i]) {
					System.out.println("maximum value is  " + arr1[i]);
				}

				else {
					System.out.println("maximum value is  " + arr2[i]);
				}
			}

		}

	}

	public static void main(String[] args) {
		printMaxIndex();
	}
}
