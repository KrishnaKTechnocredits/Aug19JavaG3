package PoojaG.Assignment2;

public class CheckDifferIndexFromArrays {
	
static void checkDifferIndexFromArrays(int a[], int b[]){
		
		for(int i=0; i<a.length; i++){
			if(a[i] != b[i]){
				
				System.out.println(i);
				
		}
		
	}
		
}
	public static void main(String[] args) {
		
		int a[] = {10,2,9,14,3};
		int b[] = {10,2,18,14,13};
		
		checkDifferIndexFromArrays(a, b);
	
		}

}
