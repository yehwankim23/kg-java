package d13.c07s10.example1;

public class Circle extends Shape {
	private int radius;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;

	}

	public int getRadius() {
		return radius;

	}

	public void setRadius(int radius) {
		this.radius = radius;

	}

	public double CalculateArea() {
		return Math.PI * radius * radius;

	}

}
