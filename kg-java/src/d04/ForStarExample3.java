package d04;

public class ForStarExample3 {

	public static void main(String[] args) {
		int dan = 5;
		for(int i = 0; i < dan; i++) {
			for(int j = 0; j < 4 - i; j++) {
				System.out.print(" ");

			}

			for(int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");

			}

			System.out.println();

		}
		
		for(int i = 0; i < dan - 1; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print(" ");

			}

			for(int j = 0; j < 7 - 2 * i; j++) {
				System.out.print("*");

			}

			System.out.println();

		}

	}

}
