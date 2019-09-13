package PoojaG.Assignment4;

public class ReversFullString {

		static void reverse() {
			String str = "there is an apple";
			String rev = "";
			str= str.replace(" ", "");
			for (int i = str.length() - 1; i >= 0; i--) {
				rev = rev + str.charAt(i);
			}
			System.out.println(rev);
		}

		public static void main(String[] args) {
			reverse();
		}

}
