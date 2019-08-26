package Neha;

public class AbsoluteDifference {
	static void absolutediff(int x, int y) {

		int result = 0;
		result = x - y;
		if (result < 0) {
			result = result * -1;
			System.out.println("Absolute Diff: " + result);
		} else {
			System.out.println("Difference: " + result);
		}

	}

	public static void main(String[] args) {
		absolutediff(3, 7);
	}

}
