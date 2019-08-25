package Neha;

public class sumOfArrayN {

	static void sumOfArray(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}
		System.out.println("Sum:" + sum);
	}

	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		sumOfArray(a);

	}

}
