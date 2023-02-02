/* Can be use to create game */
/* POLYMORPHISM Concept */

public class TestPoint {

	public static void main(String[] args) {

		// call default constructor
		Point2D p1 = new Point2D();
		System.out.println("Dafault x, y of Point2D = " + p1);
		p1.setXY(10, 11);
		System.out.println("x, y of Point2D = " + p1);

		// return value from x by method getXY()
		System.out.println("x of Point2D is : " + p1.getXY()[0]);
		System.out.println("y of Point2D is : " + p1.getXY()[1]);

		Point3D p2 = new Point3D();
		System.out.println("Dafault x, y of Point3D = " + p2);
		p2.setXYZ(10, 12, 7);
		System.out.println("x, y, and z of Point3D = " + p2);
		System.out.println("x of Point3D is : " + p2.getXYZ()[0]);
		System.out.println("y of Point3D is : " + p2.getXYZ()[1]);
		System.out.println("z of Point3D is : " + p2.getXYZ()[2]);

	}
}
