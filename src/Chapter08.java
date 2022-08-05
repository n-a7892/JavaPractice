
public class Chapter08 {
	public static void main(String[] args) {
		int number1 = 1;
		while (number1 < 5) {
			System.out.println(number1 * number1);
			number1++;
		}

		int array[] = { 1, 4, 14, 25 };
		for (int number2 = 0; number2 < array.length; number2++) {
			System.out.println(array[number2]);
		}

		for (int number3 : array) {
			if (number3 % 2 == 0) {
				continue;
			}
			System.out.println(number3);
		}
	}
}
