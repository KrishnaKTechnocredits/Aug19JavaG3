package Aviral;

public class MaximumName {

	
	 static String maxname = "";
	  static int size = 0;
	  static  String maxlength(String[] str)
	  {
		  
		  
		  for(int i = 0; i<str.length;i++)
		  {
			  if(size<str[i].length())
			  {    
				  size = str[i].length();
				  maxname = str[i];
				 
			  }
		  }
		  
		 // System.out.println("maxSizeString = " + maxsize);
		  //System.out.println("length = "+ size);
		  return maxname;
		  
	  }
	  public static void main(String[] args) {
		  String [] str = { "Ganni","Aviral","Kush","jeet"};
		String maxname =  MaximumName.maxlength(str);	
		System.out.println(maxname);
	}
}
