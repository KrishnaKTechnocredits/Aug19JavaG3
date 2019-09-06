package PoojaG.Assignment3;

import java.util.Scanner;

public class SumOfNumbers {
	
	/*static void sumOfNumbers(String a){
		
		for(int i=0; i<a.length(); i++){
			
			for(int j=1; j<a.length(); j++){
				
				int Sum=(i)+a(j);
				
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int: ");
		int a = sc.nextInt();
		sc.close();
		String str = Integer.toString(a);		
		sumOfNumbers(str);
		

	}

}
*/

public static void main(String args[])
    {
        int a, b;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        b = s.nextInt();
        s.close();
        while(b > 0)
        {
            a = b % 10;
            sum = sum + a;
            b = b / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}