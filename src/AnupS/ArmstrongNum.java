package AnupS;

import java.util.Scanner;

//WAP to check if a number is Armstrong or not
//Example:- input:- 153
//output:-153
public class ArmstrongNum {
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		armstrongNumber(num);

}

	static void armstrongNumber(int num) {
		int a = 0;
		int sum = 0;
		int n = num;
		while(n > 0)
		{
			a = n % 10;
			n = n/10;
			sum = sum+(a*a*a);
		}
		if(sum == num)
		{
			System.out.println("The number is Armstrong ");
		}
		else
		{
			System.out.println("The number is not Armstrong ");
		}
		
	}
}
