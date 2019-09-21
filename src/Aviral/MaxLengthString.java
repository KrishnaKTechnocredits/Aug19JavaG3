package Aviral;

public class MaxLengthString {
	static int size =0;
	static String maxname = "";
	
    static String maxlength(String[] str)
    {
    	   for(int i = 0;i<str.length;i++)
    	   {
    		   if(size < str[i].length())
    		   {
    			   size = str[i].length();
    			   maxname = str[i];
    		   }
    	   }
		return maxname;
    			

    }
    public static void main(String[] args) {
    	MaxLengthString max = new MaxLengthString();
    	String [] str = { "Ganni","Aviral","Kush","jeet"};
    	String maxname = MaxLengthString.maxlength(str);
    	System.out.println(maxname);
    	
	}
}
