//WAP to check whether arrays are equals or not.
package Assignment2;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 23, 43, 77 };
		int arr1[] = { 12, 23, 43, 77 };
		checkArrayEqualsOrNot(arr, arr1);

	}

	private static void checkArrayEqualsOrNot(int[] arr, int[] arr1) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr1[i]) {
				cnt = 1;
				break;
			}

		}
		if (cnt == 1)
			System.out.println("Arrays are not equal");
		else
			System.out.println("Arrays are equal");
	}

}
