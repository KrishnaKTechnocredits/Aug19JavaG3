package PoojaG.Assignment3;

public class PosAndNegNum {

	static void findPositivNegativeNumAndSum(int a[]) {
		int possum = 0;
		int negsum = 0;
		System.out.print("Positive Number :");
		for (int i = 0; i < a.length; i++) {

			if (a[i] > 0) {
				System.out.print(a[i] + " ");
				possum = possum + a[i];
			}

		}
		System.out.println();
		System.out.print("Negative Number :");
		for (int j = 0; j < a.length; j++) {
			if (a[j] < 0) {
				System.out.print(a[j] + " ");
				negsum = negsum + a[j];
			}
		}
		// System.out.println(pos);
		// System.out.println(neg);
		System.out.println();
		System.out.println("Sum of Positive :" + possum);
		System.out.println("Sum of Negative :" + negsum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 6, -9, 14, -25, 6, 7, -14 };
		findPositivNegativeNumAndSum(a);
	}
}
