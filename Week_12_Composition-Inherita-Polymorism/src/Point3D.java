/*The Point3D class model a 3D point at (x,y,z)
 * Which is a subclass of Point2D
 */

public class Point3D extends Point2D {

	// private instance variables
	private float z;

	// Constructor
	/* Default Constructor */
	public Point3D() {
		super();
		this.z = 0;
	}

	/* Constructor with parameters (x,y,z) */
	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;

	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public void setXYZ(float x, float y, float z) {
		super.setX(x);
		super.setY(y);
		this.z = z;
	}
	
	public float[] getXYZ() {
		float[] storage = new float[3]; // Construct an array of 2 element
		storage[0] = super.getX();
		storage[1] = super.getY();
		storage[2] = this.z;
		return storage;
	}
	
	/*Return a string in the form of (x,y), and z*/
	/* Same Method like (Super Class) --> Called "POLYMORPHISM" !!!!! */
	@Override
	public String toString() {
		return super.toString()+" and "+getZ();
	}

}
