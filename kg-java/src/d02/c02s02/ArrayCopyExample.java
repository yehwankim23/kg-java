package d02.c02s02;

public class ArrayCopyExample {

	public static void main(String[] args) {
		int arr[] = new int[12];
		int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

		}
		System.out.println();

		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);

		}
		System.out.println();

		System.arraycopy(arr2, 1, arr, 2, 8);

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

		}

	}

}
