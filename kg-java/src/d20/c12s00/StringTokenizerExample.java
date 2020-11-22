package d20.c12s00;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("this is a test");
		System.out.println("Tokenizing by space");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());

		}
		System.out.println();

		String accessLog = "2017.03.11,SAT,/board?bbsno=30,USER123;GROUP1";
		StringTokenizer accessTokens1 = new StringTokenizer(accessLog, ",");
		System.out.println("Tokenizing by ,");
		while(accessTokens1.hasMoreTokens()) {
			System.out.println(accessTokens1.nextToken());

		}
		System.out.println();

		StringTokenizer accessTokens2 = new StringTokenizer(accessLog, ".,;");
		System.out.println("Tokenizing by .,;");
		while(accessTokens2.hasMoreTokens()) {
			System.out.println(accessTokens2.nextToken());

		}
		System.out.println();

		StringTokenizer accessTokens3 = new StringTokenizer(accessLog, ",", true);
		System.out.println("Token 포함");
		while(accessTokens3.hasMoreTokens()) {
			System.out.println(accessTokens3.nextToken());

		}
		System.out.println();

	}

}
