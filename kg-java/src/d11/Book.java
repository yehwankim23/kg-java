package d11;

public class Book {
	private int number;
	private String title;

	public Book(int number, String title) {
		if(number < 100000) {
			this.number = number;

		} else {
			System.out.println("번호가 유효하지 않습니다.");
			this.number = 0;

		}

	}

	public int getNumber() {
		return number;

	}

	public void setNumber(int number) {
		if(number < 100000) {
			this.number = number;

		} else {
			System.out.println("번호가 유효하지 않습니다.");
			this.number = 0;

		}

	}

	public String getTitle() {
		return title;

	}

	public void setTitle(String title) {
		this.title = title;

	}

	public void read() {
		System.out.println("그냥책을 읽는다.");

	}

}
