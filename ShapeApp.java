
public class ShapeApp {

	public static void main(String[] args) {
		Circle c = new Circle(4);
		c.calculateArea();
		System.out.println("circle area: " + c.getArea());
		
		Rectangle s = new Rectangle(16,2);
		s.calculateArea();
		System.out.println("rectangle area: " + s.getArea());
	}

}
