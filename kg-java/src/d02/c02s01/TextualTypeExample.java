package d02.c02s01;

public class TextualTypeExample {

	public static void main(String[] args) {
		char one = 'A';
		char two = '\t';
		char three = '\uAC00';	//16진수 42ㅏ리 입력, 한글 '가'에 해당
		String four = "\uD604\uC218";
		String five = "dream";
		System.out.printf("%c, %c, %c, %s, %s", one, two, three, four, five);

	}

}
