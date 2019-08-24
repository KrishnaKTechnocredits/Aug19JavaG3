package ashish;

//Prime number program

public class PrimeCheck2 {
	
	static void isPrime1(int start,int end)
	{
		int sum=0,Primenocount=0;
		for(int number=start;number<=end;number++)
		{
			int cnt=0;
			for(int i=2;i<=number/2;i++) // i=1 is not applicable and i<number will work but it increases time complexity and also i<=n/2 because till half digit number can be divided
			{
			//int number1=100;
				if(number%i == 0)
				{	
				cnt=1;
				break;  // break terminates for loop not if loop and if multiple for loops then terminates inner most for loop
				}
			}
			if(cnt==0)
			{
				System.out.println("Number " +number+ " is prime");
				sum=sum+number;
				Primenocount++;
			}
			else
			{
				System.out.println("Number " +number+ " is not prime");
			}
		}
		System.out.println("Sum of all prime number is "+sum);
		System.out.println("Total prime numbers from "+start+" to "+end+" is "+Primenocount);
		System.out.println("Average of prime numbers from "+start+" to "+end+" is "+sum/Primenocount);
	}
	
	public static void main(String[] args)
	{

		PrimeCheck2 pcheck1 = new PrimeCheck2();
		isPrime1(1,21);
		
	}
}