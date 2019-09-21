package Aviral;

public class ReverseArray {

	
	    void reverse()
	    {
	    	int [] a = {1,2,3,4,5};
	    	for(int i = a.length-1;i>=0;i--)
	    	{
	    		System.out.println(a[i]);
	    	}
	    }
	    public static void main(String[] args) {
	    	ReverseArray rev = new ReverseArray();
	    	rev.reverse();
		}
}
