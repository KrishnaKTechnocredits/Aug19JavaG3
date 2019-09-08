package JavaStringPgm;

public class StringParseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "10";
		String y = "20";
		System.out.println("x+y");

		int x1 = Integer.parseInt(x);
		int x2 = Integer.parseInt(y);
		System.out.println(x1 + x2);

		String num = "145234";
		char ch = num.charAt(0);
		/*
		 * int z= Integer.parseInt(ch+""); System.out.println(z);
		 */
		String ch1 = String.valueOf(ch);
		int z = Integer.parseInt(ch1);
		System.out.println(z);

		int num1 = 1249;
		int sum = 0;
		while (num1 > 0) {
			int r = num1 % 10; // take remainder
			sum = sum + r;
			num1 = num1 / 10; // take qoutient

			System.out.println(sum);

		}

	}
}
