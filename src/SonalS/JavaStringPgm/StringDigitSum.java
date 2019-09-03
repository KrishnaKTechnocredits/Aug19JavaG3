package JavaStringPgm;

public class StringDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=digitSum("1432");
		System.out.println("Additon of string=" +ans);
	}

	private static int digitSum(String input) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
			String temp = String.valueOf(input.charAt(i));
			int x = Integer.parseInt(temp);
			sum = sum + x;
			
		}
		return sum;
	}

}
