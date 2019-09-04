package JavaStringPgm;

public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Technocredits";
	    char[]ch=str.toCharArray();
	    int count=0;
	    for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='e')
			{
				count++;
				
			}
		}
      System.out.println(count);
	}

}
