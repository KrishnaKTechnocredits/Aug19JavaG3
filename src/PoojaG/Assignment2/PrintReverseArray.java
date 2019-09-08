package PoojaG.Assignment2;

public class PrintReverseArray{
	
	static void printReverseArray(int a[]){
				//int i= 0;
			for(int i=a.length-1; i>=0; i--){
				
				if(i>=0){
					System.out.print(a[i]+ " ");
				}
			}
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5, 6, 9, 10, 14, 63};
		printReverseArray(a);

	}

}
