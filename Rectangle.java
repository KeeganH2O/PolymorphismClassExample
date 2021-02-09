
public class Rectangle extends Shape{
	private double length, width;
	
	public Rectangle(double l, double w) {
		super();
		length = l;
		width = w;
		//how do you call a abstract method
	}
	
	protected void calculateArea() {
		area = length*width;
	}
	
	public double getArea() {
		return area;
	}
}
