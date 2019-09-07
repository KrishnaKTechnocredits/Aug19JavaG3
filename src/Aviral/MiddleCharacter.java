package Aviral;

public class MiddleCharacter {
		
		  static  void  maxlength(String[] str)
		  {
			    
			  for(int i = 0; i<str.length;i++)
			  {
				  if(str[i].length()%2 == 0)
				  {    
					  
					  char ch1 = str[i].charAt(str[i].length()/2 - 1);
					  System.out.println(str[i] +"  middle num "+ch1);
					 
					 
				  }
				  else 
				  {
					  char ch2 = str[i].charAt(str[i].length()/2);
					  System.out.println(str[i] +"  middle num "+ch2);
			  }
			  
		  }
		  }
		  public static void main(String[] args) {
			  String [] str = { "abcde","Aviral","Kush","jeet"};
			  MiddleCharacter.maxlength(str);	
	
		}
	}


