package d05.c04s04;

public class Lotto {

	public static void main(String[] args) {
		int[] arr = new int[6];
		boolean key;
		int count;

		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;

			if(i != 0) {
				key = true;

				while(key) {
					count = 0;

					for(int j = 0; j < i; j++) {
						if(arr[i] == arr[j]) {
							System.out.print(arr[i] + "->\t");
							arr[i] = (int)(Math.random() * 45) + 1;

						} else {
							count++;

						}

						if(count == i) {
							key = false;

						}

					}

				}

			}

			System.out.println(arr[i]);

		}

	}

}
