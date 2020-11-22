package d17.c10s02;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataWriteApplication {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("customer.data");
			dos = new DataOutputStream(fos);
			dos.writeUTF("홍길동");
			dos.writeUTF("hkd@test.com");
			dos.writeChar('M');
			dos.writeInt(30);
			dos.writeUTF("홍길남");
			dos.writeUTF("hkn@test.com");
			dos.writeChar('F');
			dos.writeInt(25);
			System.out.println("File saved");

		} catch(Exception e) {
			System.out.println(e.getMessage());

		} finally {
			if(dos != null) {
				try {
					dos.close();

				} catch(Exception e) {

				}

			}

		}

	}

}
