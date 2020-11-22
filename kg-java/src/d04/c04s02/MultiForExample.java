package d04.c04s02;

public class MultiForExample {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\t", j, i, i * j);
//				System.out.print(j + "*" + i + "=" + i * j + "\t");

			}
			System.out.println();

		}

	}

}
