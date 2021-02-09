
public class Circle extends Shape{
	private double radius;
	
	public Circle(double r){
		super();
		radius = r;
		//how do you call an abstract class??
	}
	
	protected void calculateArea() {
		area = Math.PI * Math.pow(radius,2);
	}
	
	public double getArea() {
		return area;
	}

}
