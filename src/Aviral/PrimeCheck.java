package Aviral;

public class PrimeCheck {

	static void isprime(int start, int end)

	{
		 int sum = 0;
		 int count = 0;
		for (int number = start; number <= end; number++) {
			int cnt = 0;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					cnt = 1;
					//System.out.println(number + "not prime");
					break;
				}
			}
			if (cnt == 0) {
				System.out.println(number + "is prime");
				sum = sum + number;
				count++;
			}
			
		}
		System.out.println(sum);
		System.out.println(count);
		System.out.println("avg =" + (sum/count) );
	}

	public static void main(String[] args) {

		isprime(1,100);
	}
}
