package AnupS;

//Duplicate number on integer array

public class AssignmentTwo {

	static void duplicateinteger() {
		int[] a = { 1, 2, 4, 4, 6, 7, 8, 8, 9, 10 };

		for (int i = 0; i <= a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("The duplicate number is " + a[j]);
				}
			}
		}

	}

	public static void main(String[] args) {
		duplicateinteger();
	}
}
