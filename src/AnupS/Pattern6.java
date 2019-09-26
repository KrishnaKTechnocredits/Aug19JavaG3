package AnupS;

public class Pattern6 {
	public static void main(String[] args) {

		int maxStar = 5;
		for (int i = 1; i <= (maxStar * 2) - 1; i++) {
			if (i <= maxStar) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int k = (maxStar * 2); k > i; k--) {
					System.out.print("*");
				}

				System.out.println();
			}
		}
	}
}
