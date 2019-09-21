package Aviral;

public class EvenNum {
	
	void even()
	{
		int [] a = {1,2,3,55,6,777,55,44,2,8,9};
		System.out.print("even num :");
		for(int i = 0; i<a.length; i++)
		{ 
			
			if(a[i]%2 ==0)
			{  
				System.out.print(a[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		EvenNum num = new EvenNum();
		num.even();
	}
	
	

}
