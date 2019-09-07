package Aviral;

public class UserDefinedCharacter {

	int count = 0;

	void stringchar(String str, char ch) {
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == ch)
			{
				count++;
			}
		}
		System.out.println("num of time a occoured is" + count);
	}

	

	public static void main(String[] args) {
		UserDefinedCharacter a = new UserDefinedCharacter();
		a.stringchar("aviral jain stntel talwade", 'a');
	}

}
