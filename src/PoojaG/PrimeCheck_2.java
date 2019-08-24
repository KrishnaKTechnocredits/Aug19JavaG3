package PoojaG;
public class PrimeCheck_2 {

	static void isPrime(int start, int end) //17
	{
		int sum = 0, count=0,avg=0;
		for(int number= start; number<=end; number++)
		{
			int cnt = 0;
			for (int i=2; i <= number/2; i++)
			{
				if(number% i == 0)
					cnt = 1;
				//System.out.println(number + "not prime");
				break; 
			}
			
			if (cnt==0)
			{
				count++;
				System.out.println(number + "is prime");
				sum = sum + number;
				avg=sum/count;
			}
					
		}
		
	System.out.println("Sum of all Prime Number:" + sum);
	System.out.println("From " +start+ " to " +end+" total prime number are" +count);
	System.out.println("Avarage of prime numbers:" +avg);
	}
	
public static void main(String[] args)
{
	
	{
	isPrime(200, 300);
	}
}

}

