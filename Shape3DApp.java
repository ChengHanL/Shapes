import java.util.Scanner;
public class Shape3DApp {
	public static void main(String args[]) {
		int numOfShapes;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose total number of shapes: ");
		numOfShapes=sc.nextInt();
		Shape[] shapes = new Shape[numOfShapes];
		for(int i=0;i<numOfShapes;i++) {
			System.out.println("Choose shape "+(i+1)+" type: ");
			System.out.println("(1):Sphere");
			System.out.println("(2):Pyramid");
			System.out.println("(3):Cuboid");
			System.out.println("(4):Cone");
			System.out.println("(5):Cylinder");
			int type = sc.nextInt();
			switch(type) {
			case 1:
				System.out.println("Choose radius of sphere:");
				double radius=sc.nextDouble();
				shapes[i]=new Sphere(radius);
				break;
			case 2:
				System.out.println("Choose base of pyramid:");
				double base=sc.nextDouble();
				System.out.println("Choose height of pyramid:");
				double height=sc.nextDouble();
				shapes[i]=new Pyramid(base,height);
				break;
			case 3:
				System.out.println("Choose length of cuboid:");
				double length=sc.nextDouble();
				System.out.println("Choose breadth of cuboid:");
				double breadth=sc.nextDouble();
				System.out.println("Choose height of cuboid:");
				double height2=sc.nextDouble();
				shapes[i]=new Cuboid(length,breadth,height2);
				break;			
			case 4:
				System.out.println("Choose radius of base cone:");
				double radius2=sc.nextDouble();
				System.out.println("Choose height of cone:");
				double height3=sc.nextDouble();
				shapes[i]=new Cone(radius2,height3);
				break;
			case 5:
				System.out.println("Choose radius of base cylinder:");
				double radius3=sc.nextDouble();
				System.out.println("Choose height of cylinder:");
				double height4=sc.nextDouble();
				shapes[i]=new Cylinder(radius3,height4);
				break;
			default:
				break;
				
		}
		}
		System.out.println("(1):Calculate area");
		System.out.println("(2):Calculate volume");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			double totalArea=0;
			for(int j=0;j<numOfShapes;j++) {
				totalArea+=shapes[j].calculateArea();
			}
			System.out.println("Total area: "+totalArea);
			break;
		case 2:
			double totalVolume=0;
			for(int k=0;k<numOfShapes;k++) {
				totalVolume+=shapes[k].calculateVolume();
			}
			System.out.println("Total volume: "+totalVolume);
		default:
			break;
		}
		
		
	}
}
