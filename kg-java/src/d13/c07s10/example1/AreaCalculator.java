package d13.c07s10.example1;

public class AreaCalculator {

	public static void main(String[] args) {
		Shape t = new Triangle("tri", 100, 100);
		Shape r = new Rectangle("rec", 100, 100);
		Shape c = new Circle("cir", 100);

		System.out.println(t.getName() + "의 넓이 = " + t.CalculateArea());
		System.out.println(r.getName() + "의 넓이 = " + r.CalculateArea());
		System.out.println(c.getName() + "의 넓이 = " + c.CalculateArea());

	}

}
