package d10.c07s01;

public class Person {
	private String name;
	private int age;

	public Person(int age, String name) {
		this.name = name;
		this.age = age;

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public Person(String name) {
		this(name, 1);

	}

	public Person() {
		this("이름없음", 1);

	}

	public String getDetails() {
		return "이름: " + name + "\t나이: " + age;

	}

}
