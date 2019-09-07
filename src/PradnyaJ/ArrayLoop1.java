package PradnyaJ;

public class ArrayLoop1 {
	
	static void printStringArray(String[] data)
	{
		for(int index=0;index<data.length;index++)
		{
			System.out.println(data[index]);
		}
		int i=0;
		while(i<data.length)
		{
			System.out.println(data[i]);
			i++;	
		}
	}
	public static void main(String[] args) {
		//String[] name ={"Maulik","Krishna"};
		String[] name = new String[3];
		name[0]= "Pradnya";
		name[1]="Bhudevi";
		name[2]="Techno";
		printStringArray(name);
	}

}
