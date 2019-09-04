package PoojaG.Assignment2;

public class FindarraycontainsNum {

	static void duplicateNumberIntArray(int a[], int x) {
		int count=0;
		for (int i = 0; i < a.length; i++) {
				
			if (a[i] == x) {
				count++;
			}
			

		}
			if(count>0)
				System.out.println("This is in Array");
			else
				System.out.println("This is not in Array");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,9,7,4,6};
		duplicateNumberIntArray(a,8);
		
	}
}
