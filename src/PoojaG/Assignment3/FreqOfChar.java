package PoojaG.Assignment3;

import java.util.Scanner;

public class FreqOfChar {
	static void findfreqOfChar(String str, char findChar){
		int count = 0;
		for(int i=0; i<str.length(); i++){
				char getChar = str.charAt(i);
				if(getChar == findChar)
					count ++;
				}
		System.out.println(count);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("Enter Char: ");
		char findChar = sc.next().charAt(0);
		sc.close();
		findfreqOfChar(str, findChar);
		

	}

}


/*import java.util.Scanner;
class FreqOfChar {
	static void findfreqOfChar(char cd[], char searchChar){
		int count =0;
		for(int i=0; i < cd.length; i++){
			if(cd[i] == searchChar){
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("Enter Char: ");
		char findChar = sc.next().charAt(0);
		sc.close();
	//String str= "electrical engineering";
	char ab[] = str.toCharArray();
	//char findChar = 'e';
	findfreqOfChar(ab, findChar);
	}
}
*/

//Program written using with CharAt 

/*public class FreqOfChar {
	static void findfreqOfChar(String str, char findChar){
		int count = 0;
		for(int i=0; i<str.length(); i++){
				char getChar = str.charAt(i);
				if(getChar == findChar)
					count ++;
				}
		System.out.println(count);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str= "electrical engineering";
	char findChar = 'e';
	findfreqOfChar(str, findChar);
		

	}

}
*/


// Program written using with toCharArray 
/*class FreqOfChar {
	static void findfreqOfChar(char cd[], char searchChar){
		int count =0;
		for(int i=0; i < cd.length; i++){
			if(cd[i] == searchChar){
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str= "electrical engineering";
	char ab[] = str.toCharArray();
	char findChar = 'e';
	findfreqOfChar(ab, findChar);
	} 
}*/