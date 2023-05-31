public class Cylinder extends Circle{
	private double height;
	public Cylinder(double radius,double height) {
		super(radius);
		this.height=height;
	}
	public double calculateVolume() {
		return super.calculateArea()*height;
	}
	public double calculateArea() {
		return super.calculateArea()*2+2*Math.PI*getRadius()*height;
	}
}
