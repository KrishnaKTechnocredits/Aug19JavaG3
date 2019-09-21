package Aviral;

public class MaxValueAtDifferIndex {
	void missingindex() {
		int[] a = { 1, 2, 4 };
		int[] b = { 1, 3, 3};
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				count++;

			}
			if (a[i] > b[i]) {
				System.out.println("array are not equals at  " + i + " index");
				System.out.println("max value btw " + a[i] + "and " + b[i] + "is" + a[i]);

			}
			if (a[i] < b[i]) {
				System.out.println("array are not equals at  " + i + " index");
				System.out.println("max value btw " + a[i] + "and " + b[i] + "is" + b[i]);

			}

		}

	}

	public static void main(String[] args) {
		MaxValueAtDifferIndex maxx = new MaxValueAtDifferIndex();
		maxx.missingindex();
	}

}
