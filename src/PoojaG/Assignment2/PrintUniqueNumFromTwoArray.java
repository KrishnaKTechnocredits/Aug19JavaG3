package PoojaG.Assignment2;

public class PrintUniqueNumFromTwoArray {
	
	static void printUniqueNumFromArrays(int a[], int b[]){
			int i= 0;
			
		for(i=0; i<a.length; i++){
			
			System.out.println(a[i]);
			if(a[i]!=b[i])
				
				System.out.println(b[i]);
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 3, 6, 9, 7};
		int b[] = {2, 5, 6, 9, 8};
		printUniqueNumFromArrays(a, b);
	}

}
