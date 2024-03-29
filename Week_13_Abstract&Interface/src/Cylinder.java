
public class Cylinder extends Circle{
	
	private double height;
	
	public Cylinder(double radius,double height) {
		super(radius,"");
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getVolume() {
		return super.getArea()*this.height;
	}
	
	@Override
	public double getArea() {
		return 2*Math.PI*(this.height+super.getRadius());
	}
	
	public String toString() {
		return "height = "+this.height+","+super.toString();
	}

}
