package d17.c10s02;

import java.io.FileOutputStream;

public class TextWriteApplication {

	public static void main(String[] args) {
		String data1 = "홍길동, M, hkd@test.com, 30";
		String data2 = "홍길남, F, hkn@test.com, 25";
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("customer.txt");
			fos.write(data1.getBytes());
			fos.write('\n');
			fos.write(data2.getBytes());
			System.out.println("File saved");

		} catch(Exception e) {
			System.out.println(e.getMessage());

		} finally {
			if(fos != null) {
				try {
					fos.close();

				} catch(Exception e) {

				}

			}

		}

	}

}
