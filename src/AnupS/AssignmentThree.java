package AnupS;

//3) Check if array contains a number in Java?
public class AssignmentThree {
	static void duplicate(int input[], int number) {
		boolean flag = false;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == number) {
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("The missing number in the array is :" + number);
		}
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 5, 6, 7, 8 };
		duplicate(array, 4);

	}

}
