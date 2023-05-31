
public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getRadius(){
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	
	public double calculateVolume() {
		return 0;
	}
	

}
