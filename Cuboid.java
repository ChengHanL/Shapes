public class Cuboid extends Rectangle{
	private double height;
	public Cuboid(double length,double breadth,double height) {
		super(length,breadth);
		this.height=height;
	}
	public double calculateArea() {
		return 2*getLength()*getBreadth()+2*getLength()*height+2*getBreadth()*height;
	}
	public double calculateVolume() {
		return super.calculateArea()*height;
	}
}
