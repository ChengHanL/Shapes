import java.util.Scanner;
public class Shape2DApp {
	public static void main(String args[]) {
		int numOfShapes;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose total number of shapes: ");
		numOfShapes=sc.nextInt();
		Shape[] shapes = new Shape[numOfShapes];
		for(int i=0;i<numOfShapes;i++) {
			System.out.println("Choose shape "+(i+1)+" type: ");
			System.out.println("(1):Square");
			System.out.println("(2):Rectangle");
			System.out.println("(3):Circle");
			System.out.println("(4):Triangle");
			int type = sc.nextInt();
			switch(type) {
			case 1:
				System.out.println("Choose side of square:");
				double side=sc.nextDouble();
				shapes[i]=new Square(side);
				break;
			case 2:
				System.out.println("Choose length of rectangle:");
				double length=sc.nextDouble();
				System.out.println("Choose breadth of rectangle:");
				double breadth=sc.nextDouble();
				shapes[i]=new Rectangle(length,breadth);
				break;
			case 3:
				System.out.println("Choose radius of circle:");
				double radius=sc.nextDouble();
				shapes[i]=new Circle(radius);
				break;			
			case 4:
				System.out.println("Choose base of triangle:");
				double base=sc.nextDouble();
				System.out.println("Choose height of triangle:");
				double height=sc.nextDouble();
				shapes[i]=new Triangle(base,height);
				break;
			default:
				break;
				
		}
		}
		System.out.println("(1):Calculate area");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			double totalArea=0;
			for(int j=0;j<numOfShapes;j++) {
				totalArea+=shapes[j].calculateArea();
			}
			System.out.println("Total area: "+totalArea);
		default:
			break;
		}
		
		
	}
}

