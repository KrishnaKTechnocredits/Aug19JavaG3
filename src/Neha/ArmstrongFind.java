//check if a number is Armstrong or not
package Neha;

public class ArmstrongFind {
	static void armstrong(int num) {
		int sum = 0;
		int x = 0;
		int num1 = 0;
		num1 = num;
		while (num > 0) {
			x = num % 10;
			num = num / 10;
			sum = sum + (x * x * x);

		}
		if (num1 == sum)
			System.out.println("The number is armstrong");
		else
			System.out.println("The number is not armstrong");

	}

	public static void main(String[] args) {
		int number = 153;
		armstrong(number);
	}

}
