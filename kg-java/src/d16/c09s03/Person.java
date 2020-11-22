package d16.c09s03;

public class Person<E> {
	private E name;
//	private int age;

	public Person(E name, int age) {
		this.name = name;
//		this.age = age;

	}

	public E getName() {
		return name;

	}

	public <T extends Object> T test(T t) {
		return t;

	}

}
