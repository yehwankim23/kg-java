package d04;

public class ForStarExample2 {

	public static void main(String[] args) {
		int dan = 5;
		for(int i = 0; i < dan; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}
