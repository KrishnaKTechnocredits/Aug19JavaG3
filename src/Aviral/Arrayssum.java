package Aviral;

public class Arrayssum {
	
	int [] array = {1,2,3,4};
	int sum1 = 0;
	void sum()
	{
		for(int i = 0;i<array.length ; i++)
		{
			sum1 += array[i];
		}
		System.out.println(sum1);
	}
	public static void main(String[] args) {
		Arrayssum arr = new Arrayssum();
		arr.sum();
	}

}
