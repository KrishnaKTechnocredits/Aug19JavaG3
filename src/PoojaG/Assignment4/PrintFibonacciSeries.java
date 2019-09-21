package PoojaG.Assignment4;

public class PrintFibonacciSeries {
	
			static void fibonaciNum() {
				int num = 7;
				int a = 0;
				int b = 1;
				int result = 0;
				for (int i = 1; i <= num; i++) {
					System.out.print(a+ " ");
					result = a + b;
					a = b;
					b = result;

				}
			}

			public static void main(String[] args) {
				fibonaciNum();
			}
	}


