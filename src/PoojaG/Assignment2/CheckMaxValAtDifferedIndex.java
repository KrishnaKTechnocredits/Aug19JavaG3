package PoojaG.Assignment2;

public class CheckMaxValAtDifferedIndex {
	
	static void checkMaxValAtDifferedIndex(int a[], int b[]){
			int large= a[0];
			int index= 0;
			for(int i=0; i<a.length; i++){
			if(a[i] != b[i]){
				if(large<a[i] || large<b[i]){
					index = i;
					if(a[i]>b[i]){
						
						large=a[i];
						
				
					}
					else {
						large= b[i];
					}
					
				}
				
				
		}
			
	}
			System.out.println(index);
		
}
	public static void main(String[] args) {
		
		int a[] = {10,2,9,14,3};
		int b[] = {10,2,18,14,13};
		
		checkMaxValAtDifferedIndex(a, b);
	
		}

}
