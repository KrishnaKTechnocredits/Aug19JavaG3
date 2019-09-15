package PoojaG.Assignment4;

public class PrintFactorialNumber {

	public static void main(String[] args) {
		int n= 5;
		int res= n;
		while(n>1){
		res= res*(n-1);
		n--;
		}
		System.out.println(res);
	}

}
