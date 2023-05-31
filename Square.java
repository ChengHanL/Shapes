
public class Square extends Shape{
	private double side;
	
	public Square(double side) {
		this.side=side;
	}
	public double getSide(){
		return this.side;
	}
	
	public void setSide(double side) {
		this.side=side;
	}
	
	
	public double calculateArea() {
		return side*side;
	}

	public double calculateVolume() {
		return 0;
	}
}
