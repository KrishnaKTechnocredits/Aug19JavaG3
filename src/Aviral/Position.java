package Aviral;


public class Position {
   // need o tell the position of array 
	void arrayPosition()
	{
		int [] a = {5,8,12,13};
		
		int i = 0;
		while(i<a.length)
		{
			if(a[i]%2==0)
			 {
				 System.out.println("num   "+ a[i] + "  position of array   "+ i);
	      	}
			i++;
		}
		
	}
	/*{
		int [] a = {2,5,8,12,13};
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]%2==0)
			 {
				 System.out.println("num   "+ a[i] + "  position of array   "+ i);
				   //System.out.println(i);   ganni :)
			 }
		 }
	
	}
	*/
	public static void main(String[] args) {
		Position pos = new Position();
		pos.arrayPosition();
	}
	
}

