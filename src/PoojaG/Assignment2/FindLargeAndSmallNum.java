package PoojaG.Assignment2;

import java.util.Arrays;

public class FindLargeAndSmallNum {

	static void findLarAndSmallNum(int a[], int x){
		
		for(int i=0; i<a.length; i++){
			
			for(int j=a.length-1; j>i; j--){
				
				if(a[i]+a[j]== x)
					
					System.out.println(a[i] + " " +a[j]);
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2, 6, 3, 9, 1};
		
		Arrays.sort(a);
		findLarAndSmallNum(a, 9);

	}

}
