package MeghaD.Assignment1;

public class Question4 {
	public static void sumOfSquareOfArray(int n){
		int a[] = {2,6,3,4,1,7};
		int sum = 0;
		int temp = 0;
		for(int i = 0; i<n;i++){
			temp =a[i]*a[i];
			sum = sum +temp;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question4.sumOfSquareOfArray(4);
	}

}
