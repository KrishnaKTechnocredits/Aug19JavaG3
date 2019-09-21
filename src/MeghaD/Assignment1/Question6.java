package MeghaD.Assignment1;

public class Question6 {
	
	public static void sumOfArray(int num){
		int a[]={};
		int b[]={};
		for(int i =0; i <=a.length;i++){
			for(int j = 0; j<=b.length;j++){
				System.out.println("sum of similar placed array digit is: " +(a[i]+b[j]));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question6.sumOfArray(3);
	}

}
