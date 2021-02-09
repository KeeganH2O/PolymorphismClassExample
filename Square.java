
public class Square extends Rectangle{

		private double side;
		
		public Square(double s) {
			super(1,1);
			side = s;
			
		}
		public void calculateArea(){
			area = side * side; 
		}
		
}
