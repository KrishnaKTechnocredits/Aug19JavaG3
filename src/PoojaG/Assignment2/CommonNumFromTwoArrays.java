package PoojaG.Assignment2;

public class CommonNumFromTwoArrays {
	
	static void printUniqueNumFromArrays(int a[], int b[]){
		
		for(int i=0; i<a.length; i++){
		
		if(a[i]==b[i])
			
			System.out.println(b[i]);
	}
	
}

public static void main(String[] args) {
	int a[] = {1, 3, 6, 9, 7};
	int b[] = {2, 5, 6, 9, 8};
	printUniqueNumFromArrays(a, b);
	
	}

}
