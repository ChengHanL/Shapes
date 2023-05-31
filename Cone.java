public class Cone extends Circle{
	private double height;
	Cone(double radius,double height){
		super(radius);
		this.height=height;
	}
	public double calculateArea() {
		return super.calculateArea()+Math.sqrt(Math.pow(height, 2)+Math.pow(getRadius(), 2))*Math.PI*getRadius();
	}
	public double calculateVolume() {
		return Math.PI*getRadius()*getRadius()*height/3;
				
	}
}
