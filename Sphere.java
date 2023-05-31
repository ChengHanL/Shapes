public class Sphere extends Circle{
	public Sphere(double radius) {
		super(radius);
	}
	public double calculateArea() {
		return 4*Math.PI*Math.pow(getRadius(), 2);
	}
	public double calculateVolume() {
		return 4*Math.PI/3*Math.pow(getRadius(), 3);
	}
}
