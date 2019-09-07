package PradnyaJ;

public class modFunction {
	
	int a[]={4,2,7,9,10,12};
	void modFunction()
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" Position ->"+i);
			}
		}
		
	}
	public static void main(String[] args) {
		modFunction mod1 = new modFunction();
		mod1.modFunction();
	}

}
