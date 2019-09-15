package PoojaG.Assignment4;

public class FindArmstrongNum {

	static int findarmstrongnum(int a) {
	 int b=0;
	 int num= 0;
	 while(a>0){
		 b= a%10;
		 num= num+b*b*b;
		 a= a/10;
	 }
	 	return num;
	}
	 public static void main(String[] args) {
	 int a= 153;
	 int num= findarmstrongnum(a);
		if(a == num){
			System.out.println("This is a Armstrong Number");
			}
			else{
				System.out.println("This is not a Armstrong Number");
			}
	}

}
