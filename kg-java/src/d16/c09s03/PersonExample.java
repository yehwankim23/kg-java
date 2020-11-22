package d16.c09s03;

public class PersonExample {

	public static void main(String[] args) {
		Person<Character> p1 = new Person<>('딸', 3);
		System.out.println(p1.getName());

		Person<String> p2 = new Person<>("아빠", 25);
		System.out.println(p2.getName());

		System.out.println(p1.test(4.8));
		System.out.println(p1.test("4.8"));
		System.out.println(p1.test(5));
		System.out.println(p1.test('5'));

	}

}
