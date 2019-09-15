package PoojaG.Assignment3;

import java.util.Scanner;

public class FindVowelInGivenString {
		
		static void findvowel(String a){
			char[] vowels= {'a', 'e','i','o','u'};
			 int count= 0;
			for(int i=0; i<a.length(); i++){
				
				for(int j=0; j<vowels.length; j++){
					if(a.charAt(i) == vowels[j]){
					count++;
						
					}
					
				}
			}
			System.out.println(count);
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String: ");
			String a = sc.nextLine();
			sc.close();
			findvowel(a);
		}
	}
