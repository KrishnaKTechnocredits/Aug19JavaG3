package Neha;

public class FactorailOfNum {
	static void factorial(int num) {
		int fact = 1;
		for (int i = 1; i <=num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		int number = 5;
		factorial(number);

	}
}
