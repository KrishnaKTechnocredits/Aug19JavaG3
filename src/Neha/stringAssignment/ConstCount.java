package Neha.stringAssignment;

public class ConstCount {

	static int count = 0;

	ConstCount() {
		count++;
	}

	public static void main(String[] args) {
		ConstCount c = new ConstCount();
		ConstCount a = new ConstCount();
		System.out.println(count);
	}
}
