public class Pyramid extends Triangle{
	public Pyramid(double base,double height) {
		super(base,height);
	}
	public double calculateArea(){
		return Math.pow(getBase(), 2)+2*getBase()*Math.sqrt(Math.pow(getBase(), 2)/4 + Math.pow(getHeight(),2));
	}
	public double calculateVolume() {
		return Math.pow(getBase(), 2)*getHeight()/3;
	}
}
