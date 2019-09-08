package PoojaG.Assignment1;

public class FindAbsoluteVal {

	static void  findAbsoluteValue(int n, int m) {
		
		int diff= n-m;
		if(diff<0){
			diff= diff*-1;
			System.out.println(diff);
		}
		
	}
	
	public static void main(String[] args) {
		findAbsoluteValue(5, 8);
	}
}
