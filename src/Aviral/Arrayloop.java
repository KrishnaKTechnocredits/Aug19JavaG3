package Aviral;

public class Arrayloop {
	
	static void arrayprint(String[] name)
	{
		int i = 0;
		while (i<name.length)
		{
			System.out.println(name[i]);
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		String [] name = new String[3];
		 
		name[0] = "avi";
		name[1] = "avvi";
		name[2] = "avvvi";
		
		arrayprint(name);
		
	}

}
