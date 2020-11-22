package d13.c07s10.example2;

public class GoldFish extends Fish implements IPet {
	@Override
	public void swim() {
		System.out.println("금붕어는 강에서 헤엄칩니다.");

	}

	@Override
	public void play() {
		System.out.println("금붕어는 물속에서 놀아요.");

	}

}
