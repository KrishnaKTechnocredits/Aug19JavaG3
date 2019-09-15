package AnupS;

//i = 1, j = 5
//i=  2,  j = 4,6
//i = 3, j = 3,5,7
//i = 4. j = 2,4,6,8
//i = 5, j = 1,3,5,7,9
public class Pattern1 {
	public static void main(String[] args) {
		int num = 5;
		for(int i=1;i<=num;i++)
		{
			for(int j=i;j<=num;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
			    System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
