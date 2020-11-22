package d05.c04s02c;

public class StarDiamond {

	public static void main(String[] args) {
		int dan = 9;
		for(int i = 0; i < dan; i++) {
			int n = Math.abs(4 - i);

			for(int j = 0; j < n; j++) {
				System.out.print(" ");

			}

			for(int j = 0; j < dan - 2 * n; j++) {
				int m = Math.abs(8 - 2 * n);

				if(j == 0 || j == m) {
					System.out.print("*");

				} else if(j % 2 == 0) {
					System.out.print("$");

				} else {
					System.out.print(" ");

				}

			}
			System.out.println();

		}

	}

}
