package d03.c03s02;

public class BitNotExample {

	public static void main(String[] args) {
		byte binData = 0b0000_1000;			//10진수 8
		System.out.println(binData);
		System.out.println(~binData);		//0b1111_0111
		System.out.println((byte)0b1111_0111);

		boolean isTrue = false;
		System.out.println(!isTrue);

	}

}
