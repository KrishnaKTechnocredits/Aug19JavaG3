package Neha;

public class PrimeCheckwithparameters {

	static void isPrime(int start, int end)

	{
		int sum = 0, count = 0, avg = 0;

		for (int number = start; number <= end; number++) {
			int cnt = 0;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					cnt = 1;
					// System.out.println(number + " is not a prime number");
					break;
				}
			}
			if (cnt == 0)

			{
				count++;
				// System.out.println(number + " is a prime number");
				sum = sum + number;
				avg = sum / count;
			}
		}

		System.out.println("sum = " + sum);
		System.out.println("Total prime are " + count);
		System.out.println("average of prime numbers are " + avg);
	}

	public static void main(String[] args) {

		isPrime(50, 100);
	}
}
