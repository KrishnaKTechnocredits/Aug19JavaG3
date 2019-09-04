package ashish;


//Eight Program
	
public class CountVowels {

	/**
	 * @paramargs
	 */
	public void Vowels()
	{
		String check="testinga";
		int check1[]={'a','r','e','i','a'};
		int b[]={1,2,10,4};
		int counta=0,counte=0,counti=0,counto=0,countu=0;
		for(int i=0;i<check1.length;i++)
		{
			
		if(check1[i]=='a')
		{
			counta++;
			
		}
		else if(check1[i]=='e')
		{
			counte++;
			
		}
		else if(check1[i]=='i')
		{
			counti++;
			
		}
		else if(check1[i]=='o')
		{
			counto++;
			
		}
		else if(check1[i]=='u')
		{
			countu++;
			
		}
		}
		System.out.println("Count of a vowel is "+counta);
		System.out.println("Count of e vowel is "+counte);
		System.out.println("Count of i vowel is "+counti);
		System.out.println("Count of o vowel is "+counto);
		System.out.println("Count of u vowel is "+countu);
		

	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		CountVowels a = new CountVowels();
		a.Vowels();
		
	}

}
