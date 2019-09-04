package PoojaG.Assignment1;

public class FindViowels {
	
	/*static void findvowel(String a){
		String[] vowels= {"a", "e","i","o","u"};
		 int count= 0;
		for(int i=0; i<a.length(); i++){
		
			for(int j=0; j<a.length(); j++){
				if(a.charAt(i) == vowels[j]{
					count++;
					
				}
				
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		
		findvowel("Pooja");
	}
}*/
	
	static int a = 0;
	static int e = 0;
	static int i = 0;
	static int o = 0;
	static int u = 0;

	static void printVowelCount(String input, char ch) {

		int count = 0;

		for (int j = 0; j < input.length(); j++) {
			if (input.charAt(j) == ch) {
				count++;
			}
		}
		System.out.println(ch + ":" + count);
	}

	public static void main(String[] args) {

		printVowelCount("Pooja", 'a');
		printVowelCount("Pooja", 'e');
		printVowelCount("Pooja", 'i');
		printVowelCount("Pooja", 'o');
		printVowelCount("Pooja", 'u');

	}

}
