// reverse number (Consider Input as Integer not as String).
package Neha.stringAssignment;

public class ReverseNumber {
	 static void reverseNum(int number)
		{
			
			int x=0;
			int sum=0;
			while(number > 0)
			{
				x = number % 10;
				number = number/10;
				sum=sum * 10 + x;
			}
			System.out.println("Reverse of given number: "+sum);

		}

		public static void main(String[] args) {
			int number = 12345;
			reverseNum(number);
		}

}
