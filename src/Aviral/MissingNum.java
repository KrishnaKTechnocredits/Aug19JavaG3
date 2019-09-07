package Aviral;

public class MissingNum {
	void missing() {

		int[] num = { 1, 3, 4, 5, 7, 9 };

		for (int i = 1; i <= 10; i++) {
			int count = 0;
			for (int j = 0; j < num.length; j++) {
				if (num[j] == i) {
					count++;

				}

			}
			if (count == 0) {
				System.out.println(i);

			}
		}
	}

	public static void main(String[] args) {
		MissingNum n = new MissingNum();
		n.missing();
	}
}
