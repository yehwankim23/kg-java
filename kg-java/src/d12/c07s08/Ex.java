package d12.c07s08;

public class Ex {
	public static void main(String[] args) {
		Person p = new Person() {
			String name = "홍길동";
			@Override
			public void id() {
				System.out.println("나는 " + name + "이다.");

			}

		};
		p.id();

	}

}
