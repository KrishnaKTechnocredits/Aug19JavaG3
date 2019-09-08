package Neha;

public class SumOfPair {
	static void sum() {
		int[] a = { 2, 4, 3, 5, 7, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if ((a[i] + a[j]) == 7) {

					System.out.println(a[i] + " + " + a[j] + " = 7");
				}
			}
		}

	}

	public static void main(String[] args) {
		sum();
	}
}
