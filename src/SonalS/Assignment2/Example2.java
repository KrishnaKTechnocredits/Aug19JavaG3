//2.Find duplicate elements from array.

package Assignment2;

public class Example2 {
	// static int arr[] = { 1, 2, 3, 4, 4, 5 };

	Void duplicateElementArray(int arr[], int value) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])

					System.out.println(arr[i] + " is duplicate element in given array");

			}

		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 example2 = new Example2();
		int arr[] = { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8 };

		example2.duplicateElementArray(arr, 10);

	}

}
