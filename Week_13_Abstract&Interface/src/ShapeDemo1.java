import java.util.Scanner;

public class ShapeDemo1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input Radius : ");
		double radius = scan.nextDouble();
		System.out.print("Input Height : ");
		double height = scan.nextDouble();
		
		Circle circle = new Circle(radius,"");
		System.out.println("Circle[radius = "+circle.getRadius()+"]");
		System.out.println("Circle[area = "+circle.getArea()+"]");
		
		System.out.println();
		Cylinder cylinder = new Cylinder(radius,height);
		System.out.println("Cylinder[height = "+cylinder.getHeight()+",radius = "+cylinder.getRadius()+"]");
		System.out.println("Cylinder[area = "+cylinder.getArea()+"]");
		System.out.println("Cylinder[volume = "+cylinder.getVolume()+"]");

	}

}
