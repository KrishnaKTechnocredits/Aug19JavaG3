package Neha.stringAssignment;

public class ReverseOnEven {
	static void reverse() {
		String s = "this is techno credits";
		String rev = "";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (i % 2 == 0){
				for (int j = str[i].length() - 1; j >= 0; j--) {
					rev = rev + str[i].charAt(j);
				}System.out.print(rev+ " ");rev = "";
			}
			else {System.out.print(str[i]+ " ");
			}
		}
	}
	public static void main(String[] args) {
		reverse();
	}

}
