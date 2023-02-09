//Abstract
public abstract class Shape {
	
	private String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	public Shape() {
		this.color = "";
	}
	
	abstract public double getArea();
	
	@Override
	public String toString() {
		return "color = "+this.color;
	}

}
