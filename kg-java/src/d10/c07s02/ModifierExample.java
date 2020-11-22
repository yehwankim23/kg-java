package d10.c07s02;

import d10.c07s02.pac.Super;

public class ModifierExample {

	public static void main(String[] args) {
		System.out.println("***** Super 참조 *****");
		Super sup = new Super();
		System.out.println("num1 = " + sup.num1 + 
//						 "\tnum1 = " + sup.num2 + 
//						 "\tnum1 = " + sup.num3 +
						 "\tnum1 = " + sup.getNum4());

		System.out.println("\n***** Sub 참조 *****");
		Sub sub = new Sub();
		sub.print();

	}

}
