package d11;

public class Novel extends Book {
	private String publisher;
	private String author;

	public Novel(int number, String title, String publisher, String author) {
		super(number, title);
		this.publisher = publisher;
		this.author = author;

	}

	public String getPublisher() {
		return publisher;

	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;

	}

	public String getAuthor() {
		return author;

	}

	public void setAuthor(String author) {
		this.author = author;

	}

	public void read() {
		System.out.println("소설책을 읽는다.");

	}

}
