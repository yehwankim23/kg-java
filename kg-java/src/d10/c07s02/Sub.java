package d10.c07s02;

import d10.c07s02.pac.Super;

public class Sub extends Super {
	private int num5 = 50;

	public void print() {
		System.out.println("Super num1 = " + num1);
		System.out.println("Super num2 = " + num2);
//		System.out.println("Super num3 = " + num3);
//		System.out.println("Super num4 = " + num4);
		System.out.println("Super num4 = " + getNum4());
		System.out.println("Super num5 = " + num5);

	}

}
