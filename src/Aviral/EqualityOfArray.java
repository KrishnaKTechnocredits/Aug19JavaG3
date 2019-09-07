package Aviral;

public class EqualityOfArray {

	// int count = 0;

	void equality() {
		int count = 0;

		int[] arr1 = { 1, 2, 3, 4 };

		int[] arr2 = { 1, 2, 3, 44 };

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {

					count++;

				}
			}
		}
		if (count < arr1.length) {
			System.out.println("both not equals");
		} else {
			System.out.println("both are equals ");
		}
	}

	public static void main(String[] args) {
		{
			EqualityOfArray equal = new EqualityOfArray();
			equal.equality();

		}
	}
}
