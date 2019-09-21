package AnupS;

public class PrimeAverage {
	
	static void numPrime(int start, int end)
	{
		int sum =0;
		int count = 0;
		
	  for(int number = start;number <=end; number++)
	  {
		  int cnt = 0;
		   for(int i=2;i<=number/2;i++)
		   {
			 if(number%i == 0)
			{
				cnt = 1;
				//System.out.println( "number" + j+  " not prime");
				break;
			}
		   }
	   
		if(cnt ==0)
		{
			//System.out.println("number" + j+  " is prime");
			sum = sum+number;
			count = count+1;
			
		}
		
	   }
	  System.out.println("The average of Prime numbers " + start+ " and " + end + " is " + (sum / count));
	}
	public static void main(String[] args) {
		numPrime(1,100);
	}

}
