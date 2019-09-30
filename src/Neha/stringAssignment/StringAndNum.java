//separate numeric and string value from the array
package Neha.stringAssignment;

public class StringAndNum {
	static void seperate() {
		String[] str = { "xyz", "77", "101", "99", "abc" };
		String s = "";
		String num = "";
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length(); j++) {

				if (Character.isDigit(str[i].charAt(j))) {

					num = num + str[i].charAt(j);
				} else {
					s = s + str[i].charAt(j);
				}
			}
			num = num + " ";
			s = s + " ";
		}
		System.out.println("Numeric -> " + num + "\n" + "String -> " + s);

	}

	public static void main(String[] args) {
		seperate();
	}

}
