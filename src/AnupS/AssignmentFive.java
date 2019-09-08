package AnupS;

//5)Write a java program to find second largest element in an array of integers?
public class AssignmentFive {
	static void secondLargeNo() {

		int arr[] = { 12, 9, 34, 87, 3, 5, 99, 65 };
		int firstLarge = 0;
		int secondLarge = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstLarge) {
				secondLarge = firstLarge;
				firstLarge = arr[i];
			} else if (arr[i] > secondLarge) {
				secondLarge = arr[i];
			}
		}
		System.out.println(" Second Largest Number: " + secondLarge);
	}

	public static void main(String[] args) {
		secondLargeNo();
	}
}
