package Neha;

public class SumOfSquare {

	static void sumOfsq(int a[]) {
		int sum = 0;
		int sq = 0;

		for (int i = 0; i < a.length; i++) {
			sq = a[i] * a[i];
			sum = sum + sq;
		}
		System.out.println("Sum of square: " + sum);

	}

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		sumOfsq(a);
	}

}
