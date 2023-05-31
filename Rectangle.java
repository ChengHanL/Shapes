
public class Rectangle extends Shape{
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public double getLength(){
		return this.length;
	}
	
	public void setLength(double length) {
		this.length=length;
	}
	
	public double getBreadth() {
		return this.breadth;
	}
	
	public void setBreadth() {
		this.breadth=breadth;
	}
	
	public double calculateArea() {
		return length*breadth;
	}

	public double calculateVolume() {
		return 0;
	}
}
