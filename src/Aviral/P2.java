package Aviral;

public class P2 {
	
	void pattern(int m , int n)
	
	 {
		for(int i = m; i<= n ; i++)
		{
			for(int j = 1; j<= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	 public static void main(String[] args){
		 P2 p = new P2();
		 p.pattern(1, 5);
	 }
	 

}
