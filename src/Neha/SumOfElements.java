package Neha;

public class SumOfElements {

	static void sumOfArray() {
		int sum = 0;
		int a[] = { 1, 2, 3, 4 };
		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}
		System.out.println("Sum:" + sum);
	}

	public static void main(String[] args) {
		sumOfArray();
	}
}
