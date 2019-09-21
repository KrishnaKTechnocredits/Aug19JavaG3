package PradnyaJ;

public class primeNumber {

	static void isPrime(int start, int end) {
		int sum =0,count=0;
		for (int number = start; number <= end; number++) {
			int cnt = 0;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					cnt = 1;
					// System.out.println(number+"" + "not prime");
					break;
				}

			}
			if (cnt == 0)
			{
				count++;
				System.out.println(number + "" + "is a Prime");
				sum=sum+number;
			}
			
		}
		System.out.println("Sum of Prime number is :" + sum);
		System.out.println("Count of Prime number is :" + count);
		System.out.println("Average of Prime number is"+(sum/count));

	}

	public static void main(String[] args) {
		// primeNumber p1= new primeNumber();
		// for(int i=2;i<=100;i++)
		isPrime(200, 300);
	}
}
