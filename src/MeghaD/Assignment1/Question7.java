package MeghaD.Assignment1;

public class Question7 {
	public static void sumOfValues(int a, int b){
		int c;
		int d;
		c=a-b;
		if(c>0)
		{
			System.out.println("Sum of the given numbers is : "+c);
		}
		else
		{
		d=c*(-1);
		System.out.println("Sum of the given numbers is: "+d);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question7.sumOfValues(-9, 8);
	}

}
