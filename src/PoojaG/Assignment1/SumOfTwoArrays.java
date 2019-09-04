package PoojaG.Assignment1;

public class SumOfTwoArrays {
	
	static void sumOfArrays(int a[], int b[], int length) {
		    
		int sum= 0;
		for(int i=0; i<length; i++) {
			
			sum= a[i]+b[i];
			System.out.println(sum);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3, 9, 8};
		int b[]= {8, 12, 74};
		int lenght= a.length;
		
		sumOfArrays(a, b, lenght);

	}

}
