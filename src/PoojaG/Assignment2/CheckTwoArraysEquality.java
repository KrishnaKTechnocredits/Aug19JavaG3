package PoojaG.Assignment2;

public class CheckTwoArraysEquality {
	
	static void checkTwoArraysEquality(int a[], int b[]){
		boolean flag= true;
		for(int i=0; i<a.length; i++){
			if(a[i] != b[i]){
				flag= false;
				
		}
		
	}
		if(flag){
			
			System.out.println("Two Arrays Are Equal");
		}
		else
			System.out.println("Two Arrays Are not Equal");
			
}
	public static void main(String[] args) {
		
		int a[] = {21, 57, 11, 37, 2};
		int b[] = {21, 57, 11, 37, 2};
		checkTwoArraysEquality(a, b);
	
		}
}
