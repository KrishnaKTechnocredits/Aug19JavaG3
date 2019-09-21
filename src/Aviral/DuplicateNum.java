package Aviral;

public class DuplicateNum {
	
	void duplicate()
	{
		int[] row = {5,1,3,2,5,4};
		{
			for(int i = 0; i<row.length; i++)
			{
				for(int j = i+1 ; j<row.length; j++)
				{
					if(row[i] == row[j])
						System.out.println("duplicate num" + row[i]);
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		DuplicateNum num =new DuplicateNum();
		num.duplicate();
	}

}
