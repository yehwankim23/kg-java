package d12.c07s09;

public class Rectangle implements Shape {
	int width;
	int height;

	public Rectangle(int width, int height)	{
		this.width = width;
		this.height = height;

	}

	public double getArea() {
		return width * height;

	}

}
