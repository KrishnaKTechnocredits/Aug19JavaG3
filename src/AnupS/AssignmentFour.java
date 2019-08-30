//4) Largest and smallest number in unsorted array and given sum is 9

package AnupS;

public class AssignmentFour {
	void findInteger() {
		int array[] = { 2, 6, 3, 9, 7, 11, 1, 8 };
		int smallest, largest;
		int sum = 9;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					smallest = array[j];
					largest = array[i];
				} else {
					smallest = array[i];
					largest = array[j];
					break;
				}

				if (smallest + largest == sum) {
					System.out.println("the numbers are  " + largest + " " + smallest);
				}
			}
		}
	}

	public static void main(String[] args) {
		AssignmentFour ab = new AssignmentFour();
		ab.findInteger();

	}

}
