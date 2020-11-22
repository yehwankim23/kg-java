package d03.c03s02;

public class CastingExample {

	public static void main(String[] args) {
		byte a = 100;
		int b = a;	//Promotion
		byte c = (byte)b;	///Type Casting
		System.out.printf("%d, %d, %d", a, b, c);

	}

}
