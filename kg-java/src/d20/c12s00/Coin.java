package d20.c12s00;

public class Coin {

	public static void main(String[] args) {
		int[] array1 = {1, 0, 0, 1, 0, 0};
		int[] array2 = {1, 1, 1, 0, 0, 0, 0};
		int[] array3 = {1, 0, 0, 0, 1, 1, 1};

		System.out.println(solution(array1));
		System.out.println(solution(array2));
		System.out.println(solution(array3));

	}

	public static  int solution(int[] array) {
		int count = 0;
		int result = -1;

		for(int i = 0; i < array.length; i++) {
			if(array[i] == 0) {
				count++;

			}

		}

		if(array.length / 2 < count) {
			result = array.length - count;

		} else {
			result = count;

		}

		return result;

	}

}
