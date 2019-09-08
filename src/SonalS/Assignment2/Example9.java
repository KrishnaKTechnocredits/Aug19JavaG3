// WAP to print all differ indexes from given array.
package Assignment2;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 10, 2, 9, 14, 3 };
		int arr2[] = { 10, 2, 18, 14, 13 };
		differAllIndexPrint(arr1, arr2);

	}

	private static void differAllIndexPrint(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		for (int i = 0, j = 0; i < arr1.length; i++, j++) {
			if (arr1[i] != arr2[j]) {
				// System.out.println(arr1[i]+":"+arr2[j]+"are the unmatched
				// values");
				System.out.println("Values are not matching at index->" + i);
			}
		}
	}

}
