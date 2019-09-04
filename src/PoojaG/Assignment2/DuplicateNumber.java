package PoojaG.Assignment2;

class DuplicateNumber {
	static void findDuplicateNumber(int a[]) {
		int i = 0;
		int count = 0;
		for (i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count = a[i];
				}

			}
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		int a[] = { 0, 3, 1, 2, 3 };
		findDuplicateNumber(a);
	}
}