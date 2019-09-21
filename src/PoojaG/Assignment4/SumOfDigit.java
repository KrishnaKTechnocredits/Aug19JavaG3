package PoojaG.Assignment4;

public class SumOfDigit {

	public static void main(String[] args) {
		int n= 12345;
		int a= 0;
		int sum= 0;
		while(n>0){
			a= n%10;
			sum= sum+a;
			n= n/10;
			
		}
		System.out.println(sum);
		
	}

}
