package d12.c07s09;

public class InterfaceExample {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(20, 34);
		Triangle tri = new Triangle(20, 34);

		System.out.println("rect's area = " + rect.getArea());
		System.out.println("tri's area = " + tri.getArea());

	}

}
