package AnupS;

public class Pattern10 {
	public static void main(String[] args) {
		int row = 4;
		for (int i = 1; i <= (row * 2) - 1; i++) {
			if (i <= row) {
				for (int j = 1; j <= row - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					if (k == 1 || k == i) {
						System.out.print("* ");
					}
					System.out.print("  ");
				}
				System.out.println();
			} else {
				for (int j = 1; j <= i - row; j++) {
					System.out.print(" ");
				}
				for (int k = (row * 2); k > i; k--) {
					if (k == (row * 2) || k == (i + 1)) {
						System.out.print("* ");
					}
					System.out.print("  ");
				}
				System.out.println();
			}

		}
	}

}
