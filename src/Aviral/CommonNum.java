package Aviral;

public class CommonNum {

	
	   void common()
	   {
		   int [] a = {1,23,3,4,533};
			int [] b = {2,333,4,5,6};
		
			for(int i = 0;i<a.length;i++)
			{
				for(int j = 0;j<b.length; j++)
				{
					if(a[i]==b[j])
					{
						System.out.println(a[i]);
					}
				}
			}
	   }
	   
	   
	   public static void main(String[] args) {
		   CommonNum num = new CommonNum();
		   num.common();
	}
}
