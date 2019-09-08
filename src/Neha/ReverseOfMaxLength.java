//Find reverse of Max Length
package Neha;

//import java.util.Scanner;

public class ReverseOfMaxLength {
	static void reverseMaxLength(String input[]) {
		
		String max = "";
		int maxLength = input[0].length();
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > maxLength) {
				max = input[i];
			}
		}
		System.out.println("Max length string :- " + max);
		for (int i = max.length() - 1; i >= 0; i--) {
			System.out.print(max.charAt(i));
		}
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of Array: ");
//		int size = sc.nextInt();
//		System.out.println("Enter the elements for the array: ");
//		String[] array = new String[size];
//		for (int i = 0; i < array.length; i++) {
//		array[i] = sc.next();
		String[] array = { "all the best", "technocredits", "", "maharashtra" };
		reverseMaxLength(array);
	
	//}
	}
	
}
