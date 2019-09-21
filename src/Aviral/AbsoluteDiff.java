package Aviral;

public class AbsoluteDiff {
	
	void num (int a , int b)
	{
		
		if(Math.abs(a) - Math.abs(b) < 0)
		{
			
	       System.out.println((Math.abs(a) - Math.abs(b))*-1);
		}
		else 
		{
			System.out.println(Math.abs(a) - Math.abs(b));
		}
		
	}
	
	
	  public static void main(String[] args) {
		  AbsoluteDiff diff = new AbsoluteDiff();
		  diff.num(-10,-20);
	}
}
