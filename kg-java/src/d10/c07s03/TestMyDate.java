package d10.c07s03;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate myBirth = new MyDate();
//		myBirth.day = 32;
		myBirth.setDay(32);
		System.out.println("My birth day is " + myBirth.getDay());

	}

}
