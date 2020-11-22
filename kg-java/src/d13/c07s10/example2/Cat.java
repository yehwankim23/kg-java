package d13.c07s10.example2;

public class Cat extends Animal implements IPet {
//	public Cat(String name, int age) {
//		super(name, age);
//
//	}

	@Override
	public void eat() {
		System.out.println("고양이는 생선을 먹습니다.");

	}

	@Override
	public void play() {
		System.out.println("고양이는 방에서 놀아요.");

	}


}
