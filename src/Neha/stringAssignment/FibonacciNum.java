//print Fibonacci series up to user required
package Neha.stringAssignment;

public class FibonacciNum {
	static void fibonaciNum() {
		int num = 7;
		int x = 0;
		int y = 1;
		int result = 0;
		for (int i = 1; i <= num; i++) {
			System.out.print(x + " ");
			result = x + y;
			x = y;
			y = result;

		}
	}

	public static void main(String[] args) {
		fibonaciNum();
	}

}
