//WAP to find out missing elements from 1 to 10 series.
package Assignment2;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		FindMissingElement(num);

	}

	private static void FindMissingElement(int[] num) {
		// TODO Auto-generated method stub
		int missNumber = 0;
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] < num[i + 1]) {
				if (num[i + 1] - num[i] != 1) {
					missNumber = num[i + 1] - 1;
					System.out.println(missNumber);
				}
			}
		}
	}
}
