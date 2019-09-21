package MeghaD.Assignment1;

public class Question8 {
	static int aCount=0;
	static int eCount=0;
	static int iCount=0;
	static int oCount=0;
	static int uCount=0;
	//int count =0;
	
	
	public static void vowelcount(String input){
		for(int x=0; x<input.length();x++){
			char ch = input.charAt(x);
			switch(ch){
			case 'a':
				aCount++;
				break;
			case 'e':
				eCount++;
				break;
			case 'i':
				iCount++;
				break;
			case 'o':
				oCount++;
				break;
			case 'u':
				uCount++;
				break;
			}
		}
		System.out.println("count for the given vowels is :" +aCount);
		System.out.println("count for the given vowels is :" +eCount);
		System.out.println("count for the given vowels is :" +iCount);
		System.out.println("count for the given vowels is :" +oCount);
		System.out.println("count for the given vowels is :" +uCount);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question8.vowelcount("MeghaDubeyisGreatLearnerofjavainTechnocreadits");
	}

}
