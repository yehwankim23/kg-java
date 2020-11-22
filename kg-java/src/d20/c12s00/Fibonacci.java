package d20.c12s00;

public class Fibonacci {

	public static void main(String[] args) {
		int one = 1;
		int two = 1;
		int three = 1;

		System.out.println(one);
		System.out.println(two);

		for(int i = 0; i < 10; i++) {
			one = two;
			two = three;
			three = one + two;

			System.out.println(three);

		}

	}

}
