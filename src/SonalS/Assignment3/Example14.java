package Assignment3;

public class Example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int array1[]={1,2,3,4,4};
      int array2[]={3,3,4,5,5};
      int[] outArray = new int[array1.length + array2.length];
      
      for (int i = 0; i < array1.length; i++) {
    	  boolean flag=false;
		  for (int j = 0; j < array2.length; j++) {
			if(array1[i]==array2[j])
			{
				
				flag=true;
			}
			
		}
        if(!flag)
        {
        	outArray[i]=array1[i];
        }
	}
      
      for (int i = 0; i < outArray.length; i++) {
		System.out.print(outArray[i]);
	}
	}

}
