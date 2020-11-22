package d20.c12s00;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String string1 = "we test coders. give us a try?";
		String string2 = "forget  cvs..save time . x x";

		System.out.println(solution(string1));
		System.out.println(solution(string2));

	}

	public static int solution(String string) {
		StringTokenizer stringTokenizer1 = new StringTokenizer(string, ".");
		int count;
		int result = -1;

		while(stringTokenizer1.hasMoreTokens()) {
			count = 0;
			StringTokenizer stringTokenizer2 = new StringTokenizer(stringTokenizer1.nextToken());

			while(stringTokenizer2.hasMoreTokens()) {
				count++;
				stringTokenizer2.nextToken();

			}

			if(result < count) {
				result = count;

			}


		}

		return result;

	}

}
