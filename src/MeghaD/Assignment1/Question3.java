package MeghaD.Assignment1;

public class Question3 {
	
	public static void sumOfGivenArray(int n){
		int a [] = {4,5,2,9,78,56,23,14,98,11};
		int sum = 0;
		for(int i = 0; i<n; i++){
			sum = sum +a[i];
			}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question3.sumOfGivenArray(5);
	}

}
