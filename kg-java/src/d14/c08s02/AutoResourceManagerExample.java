package d14.c08s02;

import java.io.*;

public class AutoResourceManagerExample {

	public static void main(String[] args) {
		try(FileInputStream in = new FileInputStream("a.txt")) {
			System.out.println("read data : " + in.read());

		} catch(NullPointerException | IOException ex) {
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());

		}

		FileInputStream in2 = null;
		try {
			in2 = new FileInputStream("a.txt");
			System.out.println("read data : " + in2.read());

		} catch(NullPointerException ex) {
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());

		} catch(IOException ex) {
			System.out.println(in2);
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());

		} finally {
			try {
				in2.close();

			} catch(IOException e) {

			}

		}

	}

}
