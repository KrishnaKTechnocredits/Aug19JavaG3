package MeghaD.Assignment1;

public class Question9 {

	static void charFreq(String input, char ch)
	{
		int count =0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i) == ch)
			{
				count++;
			}
		}
		System.out.println(ch + "-"+">"+ count);
	}
	
	public static void main(String[] args) {
		String input = "187579880";
		for(int index=0;index<input.length();index++){
			char currentChar = input.charAt(index);
			if(index == input.indexOf(currentChar))
				charFreq(input,input.charAt(index));
		}
		
	}
}










