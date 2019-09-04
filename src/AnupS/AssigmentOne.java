/*1) Find the missing number in integer array of 1 to 10?
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing,
you need to write a Java program to find that missing number in an array.package arrayAssignment2;
//Find missing number in integer array of 1 to 10*/

package AnupS;

public class AssigmentOne {

	void findinteger() {
		int i;

		int[] a = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };

		for (i = 1; i <= 10; i++) {
			int count = 0;

			for (int j = 0; j < a.length; j++) {
				if (a[j] == i) {
					count = 1;
				}
			}
			if (count == 0) {
				System.out.println("The missing number is " + i);
			}
		}
	}

	public static void main(String[] args) {
		AssigmentOne one = new AssigmentOne();
		one.findinteger();

	}

}
