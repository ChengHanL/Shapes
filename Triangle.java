
public class Triangle extends Shape{
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base=base;
		this.height=height;
	}
	public double getBase(){
		return this.base;
	}
	
	public void setBase(double base) {
		this.base=base;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight() {
		this.height=height;
	}
	
	public double calculateArea() {
		return base*height/2;
	}

	public double calculateVolume() {
		return 0;
	}
	

}
