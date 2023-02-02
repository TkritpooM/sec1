/* INHERITANCE */

public class Theater extends Movie{

	private int theaterNo;
	
	public Theater(String id,String name,Director director,int theaterNo) {
		super(id,name,director);
		this.theaterNo = theaterNo;
	}
	
	public Theater() {
	}
	
	public String getTheaterName() {
		if (this.theaterNo>=1&&this.theaterNo<=11) return "Basic Theater";
		else if(this.theaterNo>=12&&this.theaterNo<=14) return "Sweet Theater";
		else if(this.theaterNo>=15) return "Premium Theater";
		else return null;
	}
	
	public String toString() {
		return getTheaterName()+" : "+super.toString();
	}
}
