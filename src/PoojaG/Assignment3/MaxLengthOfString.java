package PoojaG.Assignment3;

public class MaxLengthOfString {
	
	static String findMaxLengthOfString(String a[]){
		int max= 0;
		String maxName= "";
		for(int i=0; i<a.length; i++){
			if(max<a[i].length()){
				max= a[i].length();
				maxName= a[i];
			
			}
			for(int j= max; j<maxName.length(); j--){
				System.out.println(a[j]);
			}
			
		}
		return maxName;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"all the best","technocredits", "", "maharashtra"};
		String x= findMaxLengthOfString(a);
		System.out.println(x);

	}

}
