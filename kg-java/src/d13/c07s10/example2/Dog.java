package d13.c07s10.example2;

public class Dog extends Animal implements IPet {
//	public Dog(String name, int age) {
//		super(name, age);
//
//	}

	@Override
	public void eat() {
		System.out.println("개는 사료를 먹습니다.");

	}

	@Override
	public void play() {
		System.out.println("개는 밖에서 놀아요.");

	}

}
