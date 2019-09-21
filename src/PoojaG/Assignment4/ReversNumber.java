package PoojaG.Assignment4;

public class ReversNumber {

	public static void main(String[] args) {
		int a= 12345;
		int digit= 0;
		int revnum= 0;
		
		while(a != 0){
			digit = a%10;
			revnum= revnum*10 + digit;
			a= a/10;
			
		}
		System.out.println(revnum);

	}

}
