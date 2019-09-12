package Neha;

public class SeperateCharNum {
	static void seperate() {
		String str = "a1b22sd5e2fw2sd3e";
		String num = "";
		String ch = "";

		for (int i = 0; i <= str.length() - 1; i++) {
			char x = str.charAt(i);
			if (Character.isDigit(x)) {
				num = num + x;
			} else {
				ch = ch + x;
			}
		}
		System.out.println("Alphabets in string : " + ch);
		System.out.println("Numbers in string : " + num);

	}

	public static void main(String[] args) {
		seperate();
	}

}
