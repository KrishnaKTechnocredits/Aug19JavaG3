package Kushp;

public class Primecheck {

	static void ifPrime(int start, int end) {
		int sum=0;int count = 0;
		for(int number= start;number<=end;number++)
		{ int cnt=0;
		
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				cnt = 1;
				//System.out.println(number + "Not prime");
				break;
			}

		}
		if (cnt == 0) {
			count++;
			System.out.println(number + "Number is prime");
			sum=sum+number;
			
		}
		}
		System.out.println("from "+start+"end "+end+"total pm are"+count);
		System.out.println("Sum of all PM"+sum);
		}

	public static void main(String dfs[]) {
		
			ifPrime(20, 50);
		}

	
}
