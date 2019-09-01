package PoojaG.Assignment2;

public class FindSecLargeNum {
	
	static void findSecLargeNumInArray(int a[]) {
		int small= a[0];
		int large= a[0];
		
		for(int i=0; i<a.length; i++){
			if(a[i]>large){
				small=large;
				large=a[i];
				
			}	
		}
		System.out.println(small);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5, 8, 4, 6, 7, 10};
		findSecLargeNumInArray(a);

	}

}
