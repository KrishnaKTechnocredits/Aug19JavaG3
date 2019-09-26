/* Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String*/
package Neha;

public class Addition {
	void add(int num1, int num2) {
		System.out.println("Sum of integer: " + (num1 + num2));
	}

	void add(float num1, float num2) {
		System.out.println("Sum of decimal: " + (num1 + num2));
	}

	void add(String s, String s1) {
		System.out.println("Sum of strings: " + (s + s1));
	}

	public static void main(String[] args) {
		Addition a = new Addition();
		a.add("Techno", "Credit");
		a.add(2, 8);
		a.add(2f, 6.7f);
	}

}
