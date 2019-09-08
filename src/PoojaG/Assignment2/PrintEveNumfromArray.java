package PoojaG.Assignment2;

public class PrintEveNumfromArray {
	
	static void printEveNumfromArray(int a[]){
		
		for(int i=0; i<a.length; i++){
			
			if(a[i]%2 == 0){
				
				System.out.println(a[i]);
			}
				
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {15, 24, 52, 49, 62, 10};
		printEveNumfromArray(a);

	}

}
