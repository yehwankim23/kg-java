package d11;

public class BookExample {

	public static void main(String[] args) {

		Book b1 = new Book(1, "그냥책");
		Book b2 = new Comic(2, "만화책", "출", "작");
		Book b3 = new Novel(3, "소설책", "판", "가");

		b1.read();
		b2.read();
		b3.read();

	}

}
